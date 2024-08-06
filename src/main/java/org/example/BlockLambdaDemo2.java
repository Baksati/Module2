package org.example;

// Блочное лямбда-выражение, которое измеряет порядок
// следования символов в строке на противоположный.
interface StringFunc {
    String func(String n);
}
public class BlockLambdaDemo2 {
    public static void main(String[] args) {

        // Это блочное лямбда-выражение изменяет порядок
        // следования символов в строке на противоположный.
        StringFunc reverse = (str) -> {
            String result = "";
            int i;

            for(i = str.length() -1; i >= 0; i --)
                result += str.charAt(i);

            return result;
        };
        System.out.println("Строка Lambda с противоположным порядком" +
                "следования символов: " +
                reverse.func("Lambda"));
        System.out.println("Строка Expression с противоположным порядком" +
                "следования символов: " +
                reverse.func("Expression"));
    }
}
