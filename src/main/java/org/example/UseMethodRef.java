package org.example;

// Использование ссылки на метод при поиске максимального значения в коллекции.
import java.util.*;

class MyClass2 {
    private int val;

    MyClass2(int v) {val = v;}

    int getVal() {return val;}
}
public class UseMethodRef {
    // Метод compareMC(), совместимый с методом compare(),
    // который определен в Comparator<T>.
    static int compareMC(MyClass2 a, MyClass2 b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass2> al = new ArrayList<MyClass2>();

        al.add(new MyClass2(1));
        al.add(new MyClass2(4));
        al.add(new MyClass2(2));
        al.add(new MyClass2(9));
        al.add(new MyClass2(3));
        al.add(new MyClass2(7));

        // Найти максимальное значение в al, используя метод compareMC().
        MyClass2 maxValObj = Collections.max(al, UseMethodRef :: compareMC);

        System.out.println("Максимальное значение равно: " + maxValObj.getVal());
    }
}
