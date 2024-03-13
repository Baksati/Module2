package org.example;
// Использование полиморфизма во время выполнения.
public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь для Figure не определена.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    //Переопределить area() для прямоугольника.
    double area() {
        System.out.println("Внутри area() для Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a,b);
    }

    //Переопределить area() для прямоугольного треугольника.
    double area() {
        System.out.println("Внутри area() для Triagle.");
        return dim1 * dim2 / 2;
    }
}

