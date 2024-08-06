package org.example;

// Блочные лямбда-выражения, которые вычисляет факториал значения int.
interface NumericFunc {
    int func(int n);
}
public class BlockLambdaDemo {
    public static void main(String[] args) {

        // Это блочное лямбда-выражение вычисляет факториал значения int.
        NumericFunc factorial = (n) -> {
            int result = 1;

            for(int i = 1; i <= n; i ++)
                result = i * result;

            return result;
        };
        System.out.println("Факториал 3 равен" + factorial.func(3));
        System.out.println("Факториал 5 равен" + factorial.func(5));
    }
}
