// Демонстрация времени жизни переменной.
class LifeTime {
    public static void main (String[] args) {
        int x;

        for (x=0; x<3; x++) {
          int y=-1; // Переменная y инициализируется при каждом входе в блок
            System.out.println("Значение y равно"+y); // Всегда выводится -1
            y=100;
            System.out.println("Теперь значение y равно"+y);
        }

    }
}