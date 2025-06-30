int main() {
    int a, b, c;
    int arr[5];
    
    a = 10;
    b = 20;
    c = a + b;
    
    println(c);
    
    if (c > 25) {
        println(a);
    } else {
        println(b);
    }
    
    int i;
    i = 0;
    while (i < 3) {
        println(i);
        i = i + 1;
    }
    
    return 0;
}