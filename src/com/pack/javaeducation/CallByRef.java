package com.pack.javaeducation;
class Test2 {
    int a, b;

    Test2(int i, int j){
        a = i;
        b = j;
    }

    // �������� ������� ������. ������ ���������� ob.a � ob.b
    // �������, ������������� ��� ������, ����� ����� ����������.
    void change(Test2 ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
public class CallByRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);

        System.out.println("ob.a � ob.b ����� �������: " + ob.a + " " + ob.b);

        ob.change(ob);

        System.out.println("ob.a � ob.b ����� ������: " + ob.a + " " + ob.b);
    }
}
