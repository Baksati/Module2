package org.example;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A(); // объект типа A
        B b = new B(); // объект типа B
        C c = new C(); // объект типа C

        A r; // получить ссылку типа A
        r = a; // r ссылается на объект A
        r.callme(); // вызывается версия callme() из A

        r = b; // r ссылается на объект B
        r.callme(); // вызывается версия callme() из B
        r = c; // r ссылается на объект C
        r.callme(); // вызывается версия callme() из C
    }
}
