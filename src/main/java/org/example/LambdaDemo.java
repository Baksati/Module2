// Демонстрация использования простого лямбда-выражения.

// Функциональный интрефейс.
package org.example;

interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; // объявить ссылку на интерфейс

        // Здесь лямбда-выражение представляет собой константное выражение.
        // Когда оно присваевается myNum, конструируется экземпляр класса.
        // где лямбда-выражение реализует метод getValue() из MyNumber.
        myNum = () -> 123.45;

        // Вызвать метод getValue(), представляемый ранее
        // присвоенным лямбда-выражением.
        System.out.println("Фиксированное значение: " + myNum.getValue());

        // Здесь используется более сложное лямбда-выражение
        myNum = () -> Math.random() * 100;

        // В следующих операторах вызывается лямбда-выражение
        // из предыдущей строки кода.
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Еще одно случайное значение: " + myNum.getValue());

        // Лямбда-выражение должно быть совместимым с методом,
        // определенным в функциональном интерфейсе.
        // Следовательно, показанный ниже код работать не будет:
        // myNum = () -> "123.03"; // Ошибка!
    }
}
