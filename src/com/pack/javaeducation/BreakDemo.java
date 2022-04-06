package com.pack.javaeducation;

class BreakDemo {

    public static void main(String[] args) {
        int num = 100;

        //Выполнение цикла до тех пор, пока квадрат значем
        // переменной i меньше значения переменной num
        for (int i = 0; i < num; i++) {
            if (i * i >= num) break; // прекращение выполнения цикла;
            // если i*i >= 100
            System.out.print(i + " ");

        }
        //System.out.println(i + " ");//i вне цикла
    }
}