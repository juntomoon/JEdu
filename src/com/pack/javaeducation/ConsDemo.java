package com.pack.javaeducation;
// Простой конструктор

class Myclass3 {
    int x;

    Myclass3() {
        x = 10;
    }
}
class ConsDemo {
    public static void main(String[] args) {
        Myclass3 t1 = new Myclass3();
        Myclass3 t2 = new Myclass3();

        System.out.println(t1.x + " " + t2.x);
    }
}
