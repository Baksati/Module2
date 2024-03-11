package org.example;
// Использовать super для преодоления сокрытия имен.
public class C {
    int i;
}

// Создать подкласс путем расширения класса C.
class D extends C {
    int i; // этот член i скрывает i в C

    D(int a, int b) {
        super.i = a; // i в C
        i = b; // i в D
    }
    void show() {
        System.out.println("i в суперклассе:" + super.i);
        System.out.println("i в подклассе:" + i);
    }
}
