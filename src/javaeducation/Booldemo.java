package javaeducation;

class Booldemo {

    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("значение b: " + b);
        b = true;
        System.out.println("значение b: " + b);
/*
Логическое управелние можно использовать для
управления условной инструкцией if */

        if (b) System.out.println("Эта инструкция выполняется");

        b = false;

        if (b) System.out.println("Эта инструкция не выполняется");

//В результате сравнения получается логическое значение
        System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
    }
}
