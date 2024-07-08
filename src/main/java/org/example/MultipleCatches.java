// Демонстрация применения нескольких конструкций catch.
package org.example;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a =" + a);
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль:" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за допустимые пределы индекса в массиве:" + e);
        }
        System.out.println("После блоков try/catch.");
    }
}
