package org.example;
// Использование аргумента переменной длинны со стандартными аргументами.
public class VarArgs2 {
    // Здесь msg является нормальным параметром, a v - параметр переменной длинны
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + "Содержимое:");

        for(int x : v)
            System.out.print(x + "");

        System.out.println();
    }

    public static void main(String[] args)
    {
        vaTest("Один аргумент переменной длинны:",10);
        vaTest("Три аргумента переменной длинны:",1, 2, 3);
        vaTest("Без аргументов переменной длинны");
    }
}
