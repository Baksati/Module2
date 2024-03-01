package org.example;
// Простой пример использования рекурсии.

public class Factorial {
    // Рекурсивный метод.
    int fact (int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
