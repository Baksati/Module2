// Использование цикла for в стиле цикла "for-each" для прохода по двумерному массиву.
class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int [] [] nums = new int [3] [5];

        //Сохранить в nums ряд значений.
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums [i] [j] = (i + 1) * (j + 1);

        //Применить цикл for в стиле "for-each" для отображения
        // и суммирования значения.
        for (int [] x : nums) {
            for (int y : x) {
                System.out.println("Значение:" + y);
                sum += y;
            }
        }
        System.out.println("Сумма:" + sum);
    }
}