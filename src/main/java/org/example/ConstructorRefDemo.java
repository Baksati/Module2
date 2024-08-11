package org.example;

// Демонстрация использования ссылки на конструктор.

// MyFunc - функциональный интерфейс, метод которого
// возвращает ссылку на конструктор MyClass.
interface MyFunc1 {
    MyClass3 func(int n);
}
class MyClass3 {
    private int val;

    // Конструктор, принимающий аргумент.
    MyClass3(int v) { val = v; }

    // Стандартный конструктор.
    MyClass3() { val = 0; }
    // ...
    int getVal() { return val; }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass3.
        // Поскольку метод func() в MyFunc1 принимает аргумент, new ссылается
        // на параметризованный конструктор MyClass3, а не стандартный.
        MyFunc1 MyClassCons = MyClass3 :: new;

        // Создать экземпляр MyClass3 через эту ссылку на конструктор.
        MyClass3 mc = MyClassCons.func(100);

        // Использовать только что созданный экземпляр MyClass3.
        System.out.println("val в mc равно" + mc.getVal());
    }
}
