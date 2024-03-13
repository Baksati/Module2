package org.example;
// Простая демонстрация применения abstract.
abstract class A {
    abstract void callme();

    // Конкретные методы в абстрактных классах по-прежнему разрешены.

    void callmetoo(){
        System.out.println("Это конкретный метода.");
    }
}

class B extends A {
    void callme() {
        System.out.println("Реализация callme() в классе B.");
    }
}


