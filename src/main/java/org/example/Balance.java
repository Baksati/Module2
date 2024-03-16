// Простой пакет.
package org.example;

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if(bal<0)
            System.out.println("-->");
        System.out.println(name + ": $" + bal);
    }
}
