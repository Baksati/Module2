package org.example;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try { // отслеживать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это выводиться не будет.");
        } catch (ArithmeticException e) { // перехватить ошибку деления на ноль
            System.out.println("Деление на наоль.");
        }
        System.out.println("После оператора catch.");
    }
}