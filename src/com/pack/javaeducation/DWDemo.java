package com.pack.javaeducation;

public class DWDemo {

    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        do {
            System.out.print("������� ������ �������, � ����� ������� ENTER: ");
            ch = (char) System.in.read(); // ������ ������� � ����������
        } while (ch != 'q');
    }
}
