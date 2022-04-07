package com.pack.javaeducation;

class EasyNumbers {
    public static void main(String[] args) {
        int num;
        System.out.println("Простые числа от 2 до 100: ");
        for (int i = 2; i < 100; i++) {
            int del, delost;
            double delone;
            delost = i/i;
            delone = i%7;
            if ( delost != 0 & delone != 0) {
                num = i;
                System.out.print(" " + num );

            }
        }
    }
}
