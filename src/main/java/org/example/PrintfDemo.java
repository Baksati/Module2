package org.example;

// Демонстрация использования printf().

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.println("Вывод ряда числовых значений в разных форматах.\n");

        System.out.printf("Различные форматы для целых чисел : ");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

        System.out.println();
        System.out.printf("Стандартный формат для чисел с плавающей точкой : %f\n",
                1234567.123);
        System.out.printf("Формат для чисел с плавающей точкой, содержащий" +
                "запятые : %, f\n", 1234567.123);
        System.out.printf("Стандартный формат для отрицательных чисел с" +
                "плавающей точкой : %, f\n", -1234567.123);
        System.out.printf("Вариант формата для отрицательных чисел с" +
                "плавающей точкой : %, (f\n", -1234567.123);

        System.out.println();
        System.out.printf("Выстраивание в столбик положительных и" +
                "отрицательных чисел : \n");
        System.out.printf("%, .2f\n%, .2f\n", 1234567.123, -1234567.123);
    }
}
