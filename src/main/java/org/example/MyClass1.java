package org.example;
// Этот класс должен реализовывать все методы интерфейсов AB и BA.
public class MyClass1 implements BA{
    @Override
    public void meth1() {
        System.out.println("Реализация meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Реализация meth3().");
    }
}
