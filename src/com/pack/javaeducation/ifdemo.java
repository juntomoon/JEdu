/*
Демонстрация применения инструкции if.
Присвойте файлу с исходным кодом имя IfDemo.java
 */
package com.pack.javaeducation;

class ifdemo {

    public static void main(String[] args) {
    int a,b,c;
        a = 2;
        b = 3;
            if(a < b) System.out.println("a меньше b");
//Следующая строка никогда не будет выведена
            if(a == b) System.out.println("Вы никогда не должны увидеть этот текст");
        System.out.println(); // пустая строка
            c = a - b; // Переменная "c" содержит значение -1
        System.out.println("c содержит -1");
            if (c >= 0) System.out.println("c - не отрицательное число");
            if (c < 0)  System.out.println("c - отрицательное число");
            c = b - a; // Теперь переменная "c" содержит значение 1
        System.out.println("c содержит 1");
            if (c >= 0 ) System.out.println("c - не отрицательное число");
            if (c < 0 ) System.out.println("c - отрицательное число" );
    }
}
