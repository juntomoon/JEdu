package javaeducation;

class Guess3 {
    public static void main(String[] args)
            throws java.io.IOException {

            char ch, answer = 'K';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попробуйте ее угадать: ");

        ch = (char) System.in.read(); //Чтение символа с клавиатуры
        if(ch == answer) System.out.println("** Правильно **");
        else {
            System.out.println("... Извините, нужная буква находится ");
            if(ch < answer) System.out.print("ближе к концу алфавита");// вложенная инструкция if
            else System.out.print("ближе к концу алфавита");
        }
    }
}
