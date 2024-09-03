package org.example;

// Демонстрация использования сериализации.

import java.io.*;
import java.io.IOException;

public class SerializationDemo {
    public static void main(String[] args) {

        // Сериализация объекта.
        try (ObjectOutputStream objOStrm =
                new ObjectOutputStream(new FileOutputStream("serial")))
        {
            MyClass8 object1 = new MyClass8("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);
            objOStrm.writeObject(object1);
        }
        catch (IOException e) {
            System.out.println("Во время сериализации возникло исключение: " + e);
        }
        // Десериализация объекта с использованием фильтра.
        try (ObjectInputStream objIStrm =
                new ObjectInputStream(new FileInputStream("serial")))
        {
            // Создать и добавить простой фильтр десериализации.
            ObjectInputFilter myfilter =
                    ObjectInputFilter.Config.createFilter("MyClass8;!*");
            objIStrm.setObjectInputFilter(myfilter);
            MyClass8 object2 = (MyClass8) objIStrm.readObject();
            System.out.println("object2: " + object2);
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Во время десериализации возникло исключение: " + e);
        }
    }
}

class MyClass8 implements Serializable {
    String s;
    int i;
    double d;

    public MyClass8(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}
