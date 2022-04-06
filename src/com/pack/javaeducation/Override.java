package com.pack.javaeducation;
/* Методы с разными сигнатурами не переопределяются,
 а перезагружаются */
class AA {
    int i, j;

    AA (int a, int b) {
        i = a;
        j = b;
    }
    // Отображение переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j );
    }
}
// Создание подкласса путем расширения класса AA
class BB extends AA{
    int k;

    BB (int a, int b, int c){
        super(a, b);
        k = c;
    }

    // Перегрузка метода show()
    void show(String msg){
        System.out.println(msg  + k);
    }
}
class Overload2 {
    public static void main(String[] args) {
        BB subOb = new BB(1 , 2 , 3);

        subOb.show("k: "); // вызов метода show() из класса BB
        subOb.show(); // вызов метода show() из класса AA
    }
}
