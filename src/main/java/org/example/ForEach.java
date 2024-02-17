// Использование цикла for в стиле "for-each".
class ForEach {
    public static void main(String[] args) {
        int [] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Применить цикл for в стиле "for-each" для отображения
        // и суммирования значения.
        for (int x : nums) {
            System.out.println("Значение:" + x);
            sum += x;
        }
        System.out.println("Сумма:" + sum);
    }
}
