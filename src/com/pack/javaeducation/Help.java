package com.pack.javaeducation;
/*
Простая справочная система.

 */
class Helppp {

    public static void main(String[] args)
        throws java.io.IOException{

        char choise; //выбор

        System.out.println("Справка:");
        System.out.println("  1. if");
        System.out.println(" 2. switch");
        System.out.print("Выберите:  ");
        choise = (char) System.in.read();

        System.out.println("\n");

        switch (choise) {
            case '1' :
                System.out.println("Иниструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println("   последовательность инструкций");
                System.out.println("  //...");
                System.out.println("}");
                break;
            default:
                System.out.print("Запрос не найден.");
        }
    }
}
