package org.example;

//Демонстрация использования лямбда-выражения, принимающего два параметра.
interface NumericTest2 {
    boolean test(int n, int d);
}
public class LambdaDemo3 {
    public static void main(String[] args) {

        // Это лямбда-выражение выясняет, является ли одно число
        // множителем другого.
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 является множителем 10");
        if(!isFactor.test(10, 3))
            System.out.println("3 не является множителем 10");
    }
}
