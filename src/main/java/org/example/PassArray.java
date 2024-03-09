package org.example;
// Использование массива для передачи методу произвольного числа аргументов.
// Это подход в старом стиле к аргументам переменной длинны.
public class PassArray {
    static void vaTest(int[] v) {
        System.out.print("Колличество аргументов:" + v.length + "Содержимое:");
        for(int x : v)
            System.out.print(x + "");
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Обратитет внимание на то, как должен создаваться
        // массив для хранения аргументов.
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = { };

        vaTest(n1); // 1 аргумент.
        vaTest(n2); // 3 аргумент.
        vaTest(n3); // без аргументов.
    }
}
