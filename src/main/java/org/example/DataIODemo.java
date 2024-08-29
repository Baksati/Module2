package org.example;

// Демонстрация использования DataInputStream и DataOutputStream.

import java.io.*;
import java.io.IOException;

public class DataIODemo {
    public static void main(String[] args) throws IOException {

        // Для начала записать данные.
        try (DataOutputStream dout =
                new DataOutputStream(new FileOutputStream("Test.dat")))
        {
            dout.writeDouble(98.6);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть выходной файл");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        // Теперь прочитать данные.
        try (DataInputStream din =
                new DataInputStream(new FileInputStream("Test.dat")))
        {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Полученные значения: " +
                    d + "" + i + "" + b);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть входной файл");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
