package javaeducation;

import java.io.*;

/* Отображение текстового файла.

При выхове этой программы следует указать имя файла,
содержимое которого требуется просмотреть.
Например, для вывода на экран содержимого файла TEST.EXE
необходимо ввести в командной строке следующую команду
java ShowFile TEST.TXT
 */
class ShowFlle {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // Сначала нужно убедиться в том, что программе передается имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile JavaTest.txt");
            return;
        }
    //  Открытие файла, чтение из него символов
    //  не встретится признак конца файла EOF, и
    //  последующее закрытие файла в блоке finally
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException ext) {
            System.out.println("Файл не найден");
            return;
        }

        try {
            // Чтение байтов, пока не встретится символ EOF
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении файла");
            // Для закрытия файла испольщуется блок finally
        } finally {
            // Закрыть файл при выходе из блока try
            try {
                if(fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}