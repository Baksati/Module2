// Использование break в качестве "цивилизованной" формы перехода в стиле "goto".
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
            third: {
                System.out.println("Перед оператором break.");
                if (t) break second; // выйти из блока second
                System.out.println("Этот оператор не выполнится.");
            }
                System.out.println("Этот оператор не выполнится.");
            }
            System.out.println("После блока second.");
        }
    }
}
