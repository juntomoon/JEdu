package com.pack.javaeducation;

class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        // Переменная volume нициализируется динамически
        // во время выполнения программы
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Объем: " + volume);
    }

}
