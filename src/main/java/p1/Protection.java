package p1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Конструктор базового класса");
        System.out.println("n =" + n);
        System.out.println("n_pri =" + n_pri);
        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pab =" + n_pub);
    }
}

class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор производного класса");
        System.out.println("n =" + n);
        // только класс.
        // System.out.println("n_pri =" 4 + n_pri);

        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pub =" + n_pub);
    }
}
