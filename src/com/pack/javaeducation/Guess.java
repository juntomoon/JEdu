package com.pack.javaeducation;

class Guess {

    public static void main(String[] args)
        throws java.io.IOException {

        char ch, answer = 'B';

        System.out.println("�������� ����� �� ��������� A-Z.");
        System.out.print("����������� �� �������: ");

        ch = (char) System.in.read(); // ������ ������� � ����������

        if (ch == answer) System.out.println("** ���������! **");
        else System.out.print("....��������, ������ ����� ���������");
             // ��������� ���������� if
            if (ch < answer) System.out.print(" ����� � ����� ��������");
            else if (ch == answer) System.out.print("");
            else System.out.print(" ����� � ������ ��������");
    }
}
