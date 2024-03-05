package org.example;

public class UseStatic {
    static  int a = 3;
    static  int b;
    static void metch(int x) {
        System.out.println("x =" + x);
        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
    static {
        System.out.println("Инициализация в статическом блоке.");
        b = a * 4;
    }

    public static void main(String[] args) {
        metch(42);
    }
}
