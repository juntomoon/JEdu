package javaeducation;
import java.io.*;
// Чтение байтов с клавиатуры в массив
class ReadBytes {
    public static void main(String[] args)
            throws IOException {
            byte data[] = new byte[10];
            System.out.println("Введите символы.");
            System.in.read(data);
            System.out.println("Вы ввели: ");
            for (int i = 0; i < data.length; i++)
                System.out.print((char) data[i]);
        }
    }