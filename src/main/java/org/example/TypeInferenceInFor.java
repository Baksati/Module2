// Использование выведения типов локальных переменных в цикле for.
public class TypeInferenceInFor {
    public static void main(String[] args) {

        //Применить выведение типов к переменной управления циклом.
        System.out.println("Значение x:");
        for (var x = 2.5; x < 100.0; x = x * 2)
            System.out.println(x + "");

        System.out.println();
        //Применить выведение типов к переменной итерации.
        int [] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Значение в массиве nums:");
        for (var v : nums)
            System.out.println(v+ "");

        System.out.println();
    }
}
