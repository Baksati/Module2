package org.example;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // вызывает show() из B
    }
}
