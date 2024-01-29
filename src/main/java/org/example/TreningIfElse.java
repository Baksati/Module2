// Тренировка навыков.
class TreningIfElse {
    public static void main (String[] args) {
        int number=16; // значение даты
        String data;

        if (number==2||number==4||number==6)
            data="дата встречи";
        else if (number==8||number==10||number==12)
            data="дата ухода";
        else if (number==14||number==16||number==18)
            data="дата рождения";
        else
            data="Несуществующая дата";

        System.out.println("Дата рождения-это"+number+"."); // Принадлежность даты к дню рождения
    }
}
