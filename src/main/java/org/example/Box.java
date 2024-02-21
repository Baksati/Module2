package org.example;
/* Здесь в классе Box определенны три конструктора для инициализации
размеров объекта коробки различными способами.
 */
public class Box {
    double width;
    double height;
    double depth;

    // Конструктор, используемый в случае указания всех размеров.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // Конструктор, применяемый в случае, если размеры вообще не указаны.
    Box() {
        width = - 1; // использовать - 1 для обозначения.
        height = - 1; // неинициализированного.
        depth = - 1; // объект коробки.
    }
    // Конструктор, используемый в случае создания объекта кубика.
    Box(double len) {
        width = height = depth = len;
    }
    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }
}
