package org.example;
// Использование ссылки на метод экземпляра с разными объектами.

// Функциональный интерфейс с методом, который получает два
// ссылочных аргумента и возвращает булевский результат.
interface MyFunc3<T> {
    boolean func(T v1, T v2);
}

// Класс, предназначенный для хранения самой высокой температуры за сутки.
class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    // Возвратить true, если вызывающий объект HighTemp
    // содержит такую же температуру, как у ht2.
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // Возвратить true, если вызывающий объект HighTemp
    // содержит температуру, которая ниже, чем у ht2.
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {

    // Метод, возвращающий количество вхождений объекта, для которого
    // выполняются некоторые критерии, указанные параметром MyFunc.
    static <T>  int counter(T[] vals, MyFunc3<T> f, T v) {
        int count = 0;

        for(int i = 0; i < vals.length; i ++)
            if(f.func(vals[i], v))
                count ++;

        return count;
    }

    public static void main(String[] args) {
        int count;

        // Создать массив объектов HighTemp.
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82),
                                   new HighTemp(90), new HighTemp(89),
                                   new HighTemp(89), new HighTemp(91),
                                   new HighTemp(84), new HighTemp(83)};

        // Использовать counter() с массивами элементов типа HighTemp.
        // Обратите внимание, что во втором аргументе передается ссылка
        // на метод экземпляра sameTemp().
        count = counter(weekDayHighs, HighTemp :: sameTemp, new HighTemp(89));
        System.out.println("Количество суток, когда самая высокая температура" +
                "была 89 градусов: " + count);

        // Создать и использовать еще один массив элементов типа HighTemp.
        HighTemp[] weekDayHighs2 = {new HighTemp(32), new HighTemp(12),
                                    new HighTemp(24), new HighTemp(19),
                                    new HighTemp(18), new HighTemp(12),
                                    new HighTemp(-1), new HighTemp(13)};
        count = counter(weekDayHighs2, HighTemp :: sameTemp, new HighTemp(12));
        System.out.println("Количество суток, когда самая высокая температура" +
                "была 12 градусов: " + count);

        // Использовать lessThanTemp() для нахождения суток, когда температура
        // была ниже указанного значение.
        count = counter(weekDayHighs, HighTemp :: lessThanTemp, new HighTemp(89));
        System.out.println("Количество суток, когда самая высокая температура" +
                "была меньше 89 градусов: " + count);

        count = counter(weekDayHighs2, HighTemp :: lessThanTemp, new HighTemp(19));
        System.out.println("Количество суток, когда самая высокая температура" +
                "была меньше 19 градусов: " + count);
    }
}
