package org.example;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен" + vol);
        System.out.println("Вес weightbox равен" + weightbox.weight);
        System.out.println();

        // Присвоить ссылку на BoxWeight ссылке на Box.
        plainbox = weightbox;

        vol = plainbox.volume(); // нормально, метод volume() определен в Box
        System.out.println("Объем plainbox равен" + vol);

        /* Следующий оператор ошибочен, потому что член weight в plainbox
        не определен. */
        // System.out.printlin("Вес plaintbox равен" + plaintbox.weight);
    }
}
