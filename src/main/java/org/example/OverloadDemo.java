package org.example;

// Демонстрация перегрузки методов.
public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }
    // Перегрузить test() для одного целочисленного параметра.
    void test(int a) {
        System.out.println("a:" + a);
    }
    // Перегрузить test() для двух целочисленных параметров.
    void test (int a, int b) {
        System.out.println("a и b:" + a + "" +b);
    }
    // Перегрузить test() для одного параметра типа double.
    double test(double a) {
        System.out.println("double a" + a);
        return a*a;
    }
}
