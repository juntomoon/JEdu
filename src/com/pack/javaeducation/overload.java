package com.pack.javaeducation;

// ��������������� ������
class AAAA{
    int i, j;

    AAAA(int a, int b){
        i = a;
        j = b;
    }
    // ����������� ���������� i � j
    void show() {
        System.out.println("i � j: " + i + " " + j);
    }
}
    class BBBB extends AAAA {
    int k;

    BBBB(int a, int b, int c){
        super(a ,b);
        k = c;
    }
    // ���������� ������ show()
        void show(String msg) {
            System.out.println(msg + k);
        }
    }
class overload {
    public static void main(String[] args) {
        BBBB subOb = new BBBB(1, 2 ,3);

        subOb.show("k: "); // ����� ������ show() �� ������ BBBB
        subOb.show(); // ����� ������ show() �� ������ AAAA
      }
}