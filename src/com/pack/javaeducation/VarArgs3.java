package com.pack.javaeducation;
// ���������� ������ � ���������� ������ ����������

class VarArgs3 {

    static void vaTest(int ... v){
        System.out.println("vaTest(int ... ): "
                + "���������� ����������: " + v.length);
        System.out.println("����������: ");

        for (int i = 0; i < v.length; i++)
            System.out.println("arg " + i + ": " + v[i]);

        System.out.println();
    }
    static void vaTest(boolean ... v){
        System.out.println("vaTest(boolean ...):"
                + "���������� ����������: " + v.length);
        System.out.println("����������: ");

        for (int i = 0; i < v.length; i++)
            System.out.println("arg " + i + ": " + v[i]);

        System.out.println();
    }
    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String msg, int ...): "
        + msg + v.length);
        System.out.println("����������: ");

        for (int i = 0; i < v.length; i++)
            System.out.println("arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        {
            vaTest(1, 2, 3);
            vaTest("������������: ",10 , 20);
            vaTest(true, false, false);
        }
    }
}

