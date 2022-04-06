/*
Демонстрация различий между типами int и double.
Присвойте файлу с исходным кодом имя Example3.java
 */
package com.pack.javaeducation;

public class Example3  {

    public static void main(String[] args) {
        {
            int var;
            double x;
            var = 10;
            x = 10.0;
            System.out.println("Начальное значение переменной var : " + var);
            System.out.println("Начальное значение переменной x: " + x);
            System.out.println();

            //Деление значения обеих переменных на 4
            var = var / 4;
            x = x / 4;
            System.out.println("Значение переменной var после деления:" + var);
            System.out.println("Значение переменной x после деления:" + x);
        }
    }
}
