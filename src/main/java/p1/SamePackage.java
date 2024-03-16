package p1;

public class SamePackage {
    SamePackage() {

        Protection p = new Protection();
        System.out.println("Конструктор класса из того же пакета");
        System.out.println("n =" + p.n);

        // Только класс.
        // System.out.println("n_pri =" + p.n_pri);

        System.out.println("n_pro =" + p.n_pro);
        System.out.println("n_pub =" + p.n_pub);
    }
}
