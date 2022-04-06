package com.pack.javaeducation;
/*
 Перегрузка метода с переменным числом аргументов
 и неоднозначность в выборе перегруженной версии

 В этой программе имеется ошибка, и
 поэтому она не будет компилироваться
 */
class varArgs4 {

    // Использование списка аргументов переменной длины типа int
    static void vaTest(int ... v){
        // ...
    }
    // Использование списка аргументов переменной длины типа boolena
    static void vaTest(boolean ... y ) {
        // ...
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        //vaTest(); // Ошибка: неоднозначность вызова!
    }
}
