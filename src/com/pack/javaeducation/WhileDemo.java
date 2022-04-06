package com.pack.javaeducation;

class WhileDemo {

    public static void main(String[] args) {
        char ch;
        // вывод букв английского алфавита, используя цикл while
        ch = 'a';
        while (ch <= 'z')
        {   System.out.print(" " + ch);
            ch++;
        }
    }
}
