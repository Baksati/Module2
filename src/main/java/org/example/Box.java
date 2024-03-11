package org.example;
// В этой программе используется наследование для расширения класса Box.
public class Box {
    double width;
    double height;
    double depth;

    // Конструктор, применяемый для клонирования объекта.
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый в случае указания всех размеров.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый в случае, если размеры вообще не указаны.
    Box() {
        width = - 1; // использовать - 1 для обозначения
        height = - 1; // неинициализированного
        depth = - 1; // объекта коробки
    }

    // Конструктор, использованный в случае создания объекта кубической коробки.
    Box(double len) {
        width = height = depth = len;
    }

    // Вычислить и возвратить объем.
    double volume() {
        return width * height * depth;
    }
}

// Теперь класс BoxWeight полностью реализует все конструкторы.
class BoxWeight extends Box {
    double weight; // вес коробки

    // Конструктор, применяемый для клонирования объекта.
    BoxWeight(BoxWeight ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // Конструктор, используемый в случае указания всех параметров.
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }

    // Стандартный конструктор.
    BoxWeight() {
        super();
        weight = -1;
    }

    // Конструктор, используемый в случае создания объекта кубической коробки.
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
