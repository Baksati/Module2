// Демонстрация работы ?.
class Ternary {
    public static void main (String[] args) {
        int i, k;
        i=10;
        k=i<1?-i:i; // получить абсолютную величину i
        System.out.println("Абсолютная величина");
        System.out.println(i+"равна"+k);

        i=-10;
        k=i<0?-i:i; // получить абсолютную величину i
        System.out.println("Абсолютная величина");
        System.out.println(i+"равна"+k);
    }
}
