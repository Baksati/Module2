package org.example;
// Динамическая диспетчеризация методов.
public class A {
    void callme() {
        System.out.println("Внутри метода callme() класса A");
    }
}

class B extends A {
    // Переопределить callme().
    void callme() {
        System.out.println("Внтури метода callme() класса B.");
    }
}

class C extends A {
    // Переопределить callme().
    void callme() {
        System.out.println("Внутри метода callme() класса C.");
    }
}


