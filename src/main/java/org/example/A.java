package org.example;
// Переопределение методов.
public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // Отобразить значения i и j.
    void show() {
        System.out.println("i и j:" + i + "" + j);
    }
}

// Создать подкласс путем раширения класса A.
class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Перегрузить show().
    void show(String msg) {
        System.out.println(msg + k);
    }
}

