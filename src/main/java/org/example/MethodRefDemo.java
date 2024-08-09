package org.example;

// Демонстрация использования ссылки на статический метод.

// Функциональный интерфейс для операций над строками.
interface StringFunc2 {
    String func(String n);
}
// В этом классе определен статический метод по имени strReverse().
class MyStringOps {
    // Статический метод, который измеряет порядок следования
    // символов на противоположный.
    String strReverse(String str) {
        String result = "";
        int i;

        for(i = str.length() -1;i >= 0; i --)
            result += str.charAt(i);

        return result;
    }
}

class MethodRefDemo {

    // Первый параметр этого метода имеет тип функционального интерфейса.
    // Таким образом, ему можно передать любой экзепляр реализации
    // интерфейса StringFunc, включая ссылку на метод.
    static String stringOp(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        // Создать объект MyStringOps.
        MyStringOps strOps = new MyStringOps();

        // Передать в stringOp() ссылку на статический метод strReverse().
        outStr = stringOp(strOps :: strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Строка с противоположным порядком следования" +
                "символов: " + outStr);
    }
}
