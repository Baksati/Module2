package org.example;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;

        System.out.println("Длинна строки strOb1:" + strOb1.length());
        System.out.println("Символ по индексу 3 в строке strOb1:" +
                strOb1.charAt(3));
        if(strOb1.equals(strOb2))
            System.out.println("Строка strOb1 равна строке strOb2");
        else
            System.out.println("Строка strOb1 не равна строке strOb2");

        if(strOb1.equals(strOb3))
            System.out.println("Срока strOb1 равна строке strOb3");
        else
            System.out.println("Строка strOb1 не равна строке strOb3");
    }
}
