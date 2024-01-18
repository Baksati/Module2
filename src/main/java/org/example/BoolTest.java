// Демонстрация значения типа boolean.
class BoolTest {
    public static void main (String[] args) {
      boolean b;
      b=false;
      System.out.println("b равно"+b);
      b=true;
      System.out.println("b равно"+b);

      // Значение boolean может управлять оператором if.
        if(b) System.out.println("Это выполняется.");

        b=false;
        if(b) System.out.println("Это не выполняется.");

        // Результатов операции отношения является значение boolean.
        System.out.println("10>9 равно"+(10>9));
    }


}
