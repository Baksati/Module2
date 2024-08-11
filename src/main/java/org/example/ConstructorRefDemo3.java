package org.example;

// Реализация простой фабрики классов с использованием ссылки на конструктор.
interface MyFunc5<R,T> {
    R func(T n);
}

// Простой обобщенный класс.
class MyClass5<T> {
    private T val;

    // Конструктор, принимающий аргумент.
    MyClass5(T v) { val = v; }

    // Стандартный конструктор. В этой программе НЕ используется.
    MyClass5() { val = null; }
    // ...
    T getVal() { return val; }
}

// Простой не обобщенный класс.
class MyClass6 {
    String str;

    // Конструктор, принимающий аргумент.
    MyClass6(String s) { str = s; }

    // Стандартный конструктор. В этой программе НЕ используется.
    MyClass6() { str = ""; }
    // ...
    String getVal() { return str; }
}
public class ConstructorRefDemo3 {

    // Фабричный метод для объектов класса. Класс обязан иметь
    // конструктор, который принимает один параметр типа T.
    // Тип создаваемого объекта указывается в R.
    static <R, T> R myClassFactory(MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {

        // Создать ссылку на конструктор MyClass5.
        // В этом случае new ссылается на конструктор, принимающий аргумент.
        MyFunc5<MyClass5<Double>, Double> myClassCons = MyClass5<Double> :: new;

        // Создать экземпляр MyClass5 с применением фабричного метода.
        MyClass5<Double> mc = myClassFactory(myClassCons, 100.1);

        // Использовать только что созданный экземпляр MyClass5.
        System.out.println("val в mc равно" + mc.getVal());

        // Теперь создать другой класс с применением myClassFactory().
        MyFunc5<MyClass6, String> myClassCons2 = MyClass6 :: new;

        // Создать экземпляр MyClass6, используя фабричный метод.
        MyClass6 mc6 = myClassFactory(myClassCons2, "Lambda");

        // Использовать только что созданный экземпляр MyClass6.
        System.out.println("str в mc6 равно" + mc6.getVal());
    }
}
