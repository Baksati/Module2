// Использование break с вложенными циклами.
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход" + i + ":");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break; // прекратить выполнение цикла если j равно 10
                System.out.println(j + "");
            }
            System.out.println();
        }
        System.out.println("Цикл завершен.");
    }
}
