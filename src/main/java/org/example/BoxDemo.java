// В этом классе объявляется объект типа Box.
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
                double vol;
        // Присвоить значение переменным экземпляра mybox.
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // Вычислить объем коробки.
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен" + vol);
    }
}
