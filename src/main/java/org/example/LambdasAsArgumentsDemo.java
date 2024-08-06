package org.example;

// Использование лямбда-выражений в качестве аргумента метода.
interface StringFunc1 {
    String func(String n);
}
public class LambdasAsArgumentsDemo {
    // Типом первого параметра этого метода является функциоанальный интерфейс.
    // Таким образом, ему можно передавать ссылку на любом экземпляр реализации
    // данного интерфейса, в том числе экземпляр, созданный лямбда-выражением
    // Во втором параметре указывается строка, с которой нужно работать.
    static String stringOp(StringFunc1 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        System.out.println("Исходная строка: " + inStr);

        // Простое одиночное лямбда-выражение, которое переводит
        // в верхний регистр строку, переданную методу StringOp().
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Строка в верхнем регистре: " + outStr);

        // Передать блочное лямбда-выражение, которое удаляет пробелы.
        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for(i = 0; i < str.length(); i ++)
                if(str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;
        }, inStr);
        System.out.println("Строка после удаления пробелов: " + outStr);

        // Конечно можно также передавать экземпляр StringFunc, заблаговременно
        // созданный лямбда-выражением. Например, после выполнения следующего
        // объясвления reverse будет ссылаться на экземпляр StringFunc.
        StringFunc1 reverse = str -> {
            String result = "";
            int i;

            for(i = str.length() -1; i >= 0; i --)
                result += str.charAt(i);

            return  result;
        };

        // Теперь reverse можно передать в первом параметре методу stringOp(),
        // поскольку этот параметр является ссылкой на объект StringFunc.
        System.out.println("Строка с противоположным порядком следования" +
                "символов: " + stringOp(reverse, inStr));
    }
}
