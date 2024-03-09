package org.example;

public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10); // Обратите внимание на применение var.

        System.out.println("Значение i в mc теперь равно" + mc.geti());
        mc.seti(19);
        System.out.println("Значение i в mc теперь равно" + mc.geti());
    }
}
