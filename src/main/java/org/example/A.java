package org.example;
// Демонстрация выполнения конструктора.
// Создать суперкласс.
public class A {
    A() {
        System.out.println("Внутри конструктора A.");
    }
}

// Создать подкласс путем расширения A.
class B extends A {
    B() {
        System.out.println("Внутри конструктора B.");
    }
}

// Созать еще один подкласс путем расширения B.
class C extends B {
    C() {
        System.out.println("Внутри конструктора C.");
    }
}
