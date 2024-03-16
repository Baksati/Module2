package org.example;
// Пример вложенного интерфейса
// Класс A содержит член-интерфейс.

class A {
    // Вложенный интерфейс.
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// Класс B реализует вложенный интерфейс.
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
