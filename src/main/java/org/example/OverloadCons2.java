package org.example;

public class OverloadCons2 {
    public static void main(String[] args) {
        // Создать объекты коробок с применением обычных конструкторов.
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1.volume()); // создать копию объекта mybox1.
        double vol;
        // Вычислить объем первой коробки.
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен" + vol);

        // Вычислить объем второй коробки.
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен" + vol);

        // Вычислить объем кубика.
        vol = mycube.volume();
        System.out.println("Объем mycube равен" + vol);

        // Вычислить объем копии.
        vol = myclone.volume();
        System.out.println("Объем копии равен" + vol);
    }
}
