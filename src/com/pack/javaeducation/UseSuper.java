package com.pack.javaeducation;
// Использование ключевого слова super
// для предотвращения сокрытия имен
class AAA {
    int i;
}
// Создание подкласса, расширяющего класс A
class BBB extends AAA {
    int i; // эта переменная i скрывает переменную i из класса A

    BBB (int a, int b){
        super.i = a; // переменная i из класса A
        i = b; // переменная i из класса B
    }
    void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + i);
    }
}
class UseSuper {
    public static void main(String[] args) {
        BBB subOb = new BBB(1 ,2);

        subOb.show();
    }
}
