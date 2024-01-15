/*
Демонстрация работы оператора if.
Назоваите этот файл IfSample.java.
 */
class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("Значение x меньше y");

        x = x * 2;
        if (x == y) System.out.println("Теперь значение x равно y");

        x = x * 2;
        if (x > y) System.out.println("Теперь значение x больше y");

        //Здесь ничего не отобразиться
        if (x == y) System.out.println("Этот вывод вы не увидите");
    }
}
