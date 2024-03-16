package org.example;

class NestedIFdemo {
    public static void main(String[] args) {

        // Использовать ссылку на вложенный интерфейс.
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10))
            System.out.println("10 не является отрицательным");
        if(nif.isNotNegative(-12))
            System.out.println("Это выводиться не будет");
    }
}
