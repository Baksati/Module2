// Использование break для выхода из цикла.
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break; // прекратить выполнение цикла если i равно 10
            System.out.println("i:" + i);
        }
        System.out.println("Цикл завершен.");
    }
}
