/* Отображение содержимого текстового файла.
Для использования программы укажите имя файла, который хотите посмотреть.
Например, чтобы увидеть содержимое файла по имени TEST.TXT,
введите следующую командную строку:

java.ShowFile TEST.TXT

В этом варианте код, который открывает и получает доступ к файлу,
помещен в один блок try. Файл закрывается в блоке finally.
 */

package org.example;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;

        // Удостовериться, что имя файла было указано.
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя-файла");
            return;
        }

        // Следующий код открывает файл, читает символы до тех пор, пока
        // не встретиться EOF, и затем закрывает файл через блок finally.
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось открыть файл.");
            return;
        }

        // В данной точке файл открыт и может быть прочитан.
        // Следующий код читает символы до тех пор, пока не встретится EOF.
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (java.io.IOException e) {
            System.out.println("Файл не найден.");
        } finally {
            // Закрыть файл во всех случаях.
            try {
                fin.close();
            } catch (java.io.IOException e) {
                System.out.println("Ошибка при закрытии файла.");
            }
        }
    }
}
