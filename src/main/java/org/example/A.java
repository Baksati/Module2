package org.example;
// Создать суперкласс.
public class A {
    int i, j;
    void showij() {
        System.out.println("i и j:" + i + "" + j);
    }
}

// Создать подкласс путем расширения класса A.
class B extends A {
    int k;

    void showk() {
        System.out.println("k:" + k);
    }
    void sum() {
        System.out.println("i + j + k:" + (i + j + k));
    }
}
