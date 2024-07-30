/* В этой версии программы ShowFile используется оператор try с ресурсами
для автоматического закрытия файла после того, как он больше не нужен.
 */

package org.example;

import java.io.*;

public class ShowFile1 {
    public static void main(String[] args) throws java.io.IOException {
        // Удостовериться, что имя файла было указано.
        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя-файла");
            return;
        }
        // В следующем коде применяется оператор try с ресурсами для открытия
        // файла и затем его закрытия при покидании блока try.
        try(FileInputStream fin = new FileInputStream(args[0])) {
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            } catch(FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}
