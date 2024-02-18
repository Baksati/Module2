// Использование break для выхода из вложенных циклов.
public class BreakLoop4 {
    public static void main(String[] args) {
        outer: for(int i = 0; i < 3; i++) {
            System.out.println("Проход" + i + ":");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer; // выйти из обоих циклов
                System.out.println(j + "");
            }
            System.out.println("Это выводиться не будет.");
        }
        System.out.println("Циклы завершены.");
    }
}
