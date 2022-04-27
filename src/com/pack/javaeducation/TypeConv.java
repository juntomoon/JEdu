package com.pack.javaeducation;
/*
    �������������� �������������� ����� ����� ������
    �� ����� �������������� ������.
 */
class Overload3 {
    void f(int x) {
        System.out.println("������ f(int): " + x);
    }
    void f(double x) {
        System.out.println("������ f(double): " + x);
    }
}
class TypeConv {
    public static void main(String[] args) {
        Overload3 ob = new Overload3();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5f;
        ob.f(i); // ����� ������ ob.f(int)
        ob.f(d); // ����� ������ ob.f(double)

        ob.f(b); // ����� ������ ob.f(int) � ��������������� �����
        ob.f(s); // ����� ������ ob.f(int) � ��������������� �����
        ob.f(f); //����� ������ ob.f(double) � ��������������� �����
    }
}
