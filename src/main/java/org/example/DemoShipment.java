package org.example;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipmen1 равен" + vol);
        System.out.println("Вес shipmen1 равен" + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipmen2 равен" + vol);
        System.out.println("Вес shipmen2 равен" + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
    }
}
