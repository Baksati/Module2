package org.example;

// Демонстрация использования ссылки на конструктор обобщенного класса.

// Теперь MyFunc2 - обобщенный функциональный интерфейс.
interface MyFunc2<T> {
    MyClass4<T> func(T n);
}
class MyClass4<T> {
    private T val;

    // Конструктор, принимающий аргумент.
    MyClass4(T v) { val = v; }

    // Стандартный конструктор.
    MyClass4() { val = null; }

    // ...

    T getVal() { return val; }
}
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass4<T>.
        MyFunc2<Integer> myClassCons = MyClass4<Integer> :: new;

        // Создать экземпляр MyClass4<T> через эту ссылку на конструктор.
        MyClass4<Integer> mc = myClassCons.func(100);

        // Использовать только что созданный экземпляр MyClass4<T>.
        System.out.println("val в mc равно" + mc.getVal());
    }
}
