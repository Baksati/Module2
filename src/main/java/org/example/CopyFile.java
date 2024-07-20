/* Копирование файла.
Для использования файла укажите имена исходного и целевого файлов.
Например, чтобы скопировать файл по имени FIRST.TXT в файл по имени
SECOND.TXT, введите следующую командную строку:

java CopyFile FIRST.TXT SECOND.TXT
 */

package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) throws IOException
    {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Удостовериться, что были указаны оба файла.
        if(args.length != 2) {
            System.out.println("Использование: CopyFile исходный-файл целевой-файл");
            return;
        }

        // Копировать файл.
        try {
            // Попытаться открыть файлы.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
        } catch (java.io.IOException e) {
            System.out.println("Ошибка ввода-вывода;" + e);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (java.io.IOException e2) {
                System.out.println("Ошибка при закрытии исходного файла.");
            }
            try {
                if(fout != null) fout.close();
            } catch (java.io.IOException e2) {
                System.out.println("Ошибка при закрытии целевого файла.");
            }
        }
    }
}
