package com.pack.javaeducation;
// ������������� ��������� ����� super
// ��� �������������� �������� ����

class AAA {
    int i;
}
// �������� ���������, ������������ ����� A
class BBB extends AAA {
    int i; // ��� ���������� i �������� ���������� i �� ������ A

    BBB (int a, int b){
        super.i = a; // ���������� i �� ������ A
        i = b; // ���������� i �� ������ B
    }
    void show() {
        System.out.println("i � �����������: " + super.i);
        System.out.println("i � ���������: " + i);
    }
}
class UseSuper {
    public static void main(String[] args) {
        BBB subOb = new BBB(1 ,2);

        subOb.show();
    }
}
