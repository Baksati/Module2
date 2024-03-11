package org.example;
// Расширение класс BoxWeight с целью включения стоимости доставки.

// Начать с Box.
public class Box {
    private double width;
    private double height;
    private double depth;

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

// Добавить вес.
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

// Добавить стоимость доставки.
class Shipment extends BoxWeight {
    double cost;

    // Конструктор, применяемый для клонирования объекта.
    Shipment(Shipment ob) { // передать объект конструктору
        super(ob);
        cost = ob.cost;
    }

    // Конструктор, используемый в случае указания всех параметров.
    Shipment(double w, double h, double d,
             double m, double c) {
        super(w, h, d, m); // вызвать конструктор суперкласса
        cost = c;
    }

    // Стандартный конструктор.
    Shipment() {
        super();
        cost = - 1;
    }

    // Конструктор, используемый в случае создания объекта кубической коробки.
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
