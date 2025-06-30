#ifndef SYMBOLTABLE_H
#define SYMBOLTABLE_H

#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <iomanip>

extern std::ofstream parserLogFile;

class SymbolInfo {
private:
    std::string name;
    std::string type;
    SymbolInfo* next;

public:
    // Constructors
    SymbolInfo() : name(""), type(""), next(nullptr) {}
    
    SymbolInfo(const std::string& name, const std::string& type) 
        : name(name), type(type), next(nullptr) {}

    // Destructor
    ~SymbolInfo() {
        // Don't delete next here to avoid recursive deletion
    }

    // Getters
    std::string getName() const { return name; }
    std::string getType() const { return type; }
    SymbolInfo* getNext() const { return next; }

    // Setters
    void setName(const std::string& name) { this->name = name; }
    void setType(const std::string& type) { this->type = type; }
    void setNext(SymbolInfo* next) { this->next = next; }
};

class ScopeTable {
private:
    std::string id;
    int total_buckets;
    std::vector<SymbolInfo*> table;
    ScopeTable* parentScope;
    int childScopeCounter;

    // Hash function
    unsigned int hash(const std::string& name) const {
        unsigned int hash = 0;
        for (char c : name) {
           hash = static_cast<unsigned char>(c) + (hash << 6) + (hash << 16) - hash;
        }
        return hash % total_buckets;
    }

public:
    // Constructor
    ScopeTable(int size, const std::string& id, ScopeTable* parent = nullptr) 
        : id(id), total_buckets(size), parentScope(parent), childScopeCounter(0) {
        table.resize(total_buckets, nullptr);
    }

    // Destructor
    ~ScopeTable() {
        for (int i = 0; i < total_buckets; i++) {
            SymbolInfo* current = table[i];
            while (current != nullptr) {
                SymbolInfo* temp = current;
                current = current->getNext();
                delete temp;
            }
        }
    }

    // Insert symbol
    bool insert(const std::string& name, const std::string& type) {
        unsigned int index = hash(name);
        int position = 0;
        
        SymbolInfo* current = table[index];
        
        // Check if symbol already exists in this scope
        while (current != nullptr) {
            if (current->getName() == name) {
                return false;
            }
            current = current->getNext();
            position++;
        }
        
        // Insert at the beginning of the chain
        SymbolInfo* newSymbol = new SymbolInfo(name, type);
        newSymbol->setNext(table[index]);
        table[index] = newSymbol;    
        return true;
    }

    // Lookup symbol in this scope only
    SymbolInfo* lookup(const std::string& name) const {
        unsigned int index = hash(name);
        int position = 0;
        
        SymbolInfo* current = table[index];
        while (current != nullptr) {
            if (current->getName() == name) {
                return current;
            }
            current = current->getNext();
            position++;
        }
        
        return nullptr;
    }

    // Delete symbol
    bool deleteSymbol(const std::string& name) {
        unsigned int index = hash(name);
        int position = 0;
        
        SymbolInfo* current = table[index];
        SymbolInfo* prev = nullptr;
        
        while (current != nullptr) {
            if (current->getName() == name) {
                if (prev == nullptr) {
                    table[index] = current->getNext();
                } else {
                    prev->setNext(current->getNext());
                }      
                delete current;
                return true;
            }
            prev = current;
            current = current->getNext();
            position++;
        }
        return false;
    }

    // Print the scope table
    void print() const {
        if (parserLogFile) {
            parserLogFile << "ScopeTable # " << id << std::endl;
            for (int i = 0; i < total_buckets; i++) {
                SymbolInfo* current = table[i];
                int pos = 0;
                while (current != nullptr) {
                    parserLogFile << " " << i << " --> < " << current->getName() << " , " << current->getType() << " > " << std::endl;
                    current = current->getNext();
                    pos++;
                }
            }
        }
    }

    // Getters
    std::string getId() const { return id; }
    ScopeTable* getParentScope() const { return parentScope; }
    int getChildScopeCounter() const { return childScopeCounter; }
    
    // Increment child scope counter
    void incrementChildScopeCounter() { childScopeCounter++; }
};

class SymbolTable {
private:
    ScopeTable* currentScope;
    int bucketSize;
    int scopeCounter;

public:
    // Constructor
    SymbolTable(int size) : currentScope(nullptr), bucketSize(size), scopeCounter(0) {}

    // Destructor
    ~SymbolTable() {
        while (currentScope != nullptr) {
            exitScope();
        }
    }

    // Enter a new scope
    void enterScope() {
        std::string newId;
        if (currentScope == nullptr) {
            newId = "1";
        } else {
            currentScope->incrementChildScopeCounter();
            newId = currentScope->getId() + "." + std::to_string(currentScope->getChildScopeCounter());
        }
        
        ScopeTable* newScope = new ScopeTable(bucketSize, newId, currentScope);
        currentScope = newScope;
    }

    // Exit current scope
    void exitScope() {
        if (currentScope == nullptr) {
            return;
        }
        
        std::string exitingId = currentScope->getId();
        ScopeTable* temp = currentScope;
        printCurrentScopeTable();
        currentScope = currentScope->getParentScope();
        delete temp;
    }

    // Insert symbol in current scope
    bool insert(const std::string& name, const std::string& type) {
        if (currentScope == nullptr) {
            return false;
        }
        
        return currentScope->insert(name, type);
    }

    // Remove symbol from current scope
    bool remove(const std::string& name) {
        if (currentScope == nullptr) {
            return false;
        }
        
        return currentScope->deleteSymbol(name);
    }

    // Lookup symbol in all scopes (from current to global)
    SymbolInfo* lookup(const std::string& name) {
        ScopeTable* scope = currentScope;
        
        while (scope != nullptr) {
            SymbolInfo* result = scope->lookup(name);
            if (result != nullptr) {
                return result;
            }
            scope = scope->getParentScope();
        }        
        return nullptr;
    }

    // Print current scope table
    void printCurrentScopeTable() {
        if (currentScope == nullptr) {
            return;
        }
        
        currentScope->print();
    }

    // Print all scope tables
    void printAllScopeTable() {
        ScopeTable* scope = currentScope;
        
        if (scope == nullptr) {
            return;
        }
        
        // Print from current scope to global scope
        while (scope != nullptr) {
            scope->print();
            scope = scope->getParentScope();
        }
    }

    // Get current scope ID
    std::string getCurrentScopeId() const {
        if (currentScope == nullptr) {
            return "";
        }
        return currentScope->getId();
    }
};

#endif // SYMBOLTABLE_H