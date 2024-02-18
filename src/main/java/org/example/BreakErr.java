// Эта программа содержит ошибку.
public class BreakErr {
    public static void main(String[] args) {

        one: for (int i = 0; i < 3; i ++) {
            System.out.println("Проход" + i + ":");
        }
        for (int j = 0; j < 100; j ++) {
            if (j == 10) break one; // ОШИБКА
            System.out.println(j + "");
        }
    }
}
