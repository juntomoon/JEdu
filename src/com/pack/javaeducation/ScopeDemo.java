package com.pack.javaeducation;

class ScopeDemo {
    public static void main(String[] args) {
        int x; // ��� ���������� �������� ��� ����� ���� � ������ main

        x = 10;
        if (x == 10) { // ������ ����� ������� ��������

            int y = 20; //��� ���������� �������� ������ � ������ �����

            // ��� ����������, "x" � "y", �������� � ������ ����� ����.

            System.out.println("x � y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // ������! � ���� ����� ���������� "y" ����������

        // � ���������� "x" �� �������� ��������
        System.out.println("x - ��� " + x);
    }
}
