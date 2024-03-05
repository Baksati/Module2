package org.example;
// Усовершенствованный класс Stack, в котором
// используется член length в типе массива.
public class Stack {
    private int[] stck;
    private int tos;

    // Разместить и инициализировать стек.
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в стек.
    void push(int item) {
        if (tos == stck.length - 1) // использовать член length
            System.out.println("Стек полон.");
        else
            stck[++tos] = item;
    }

    // Извлечь элемент из стека.
    int pop() {
        if (tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        } else
            return stck[tos--];
    }
}
