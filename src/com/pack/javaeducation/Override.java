package com.pack.javaeducation;
/* ������ � ������� ����������� �� ����������������,
 � ��������������� */
class AA {
    int i, j;

    AA (int a, int b) {
        i = a;
        j = b;
    }
    // ����������� ���������� i � j
    void show() {
        System.out.println("i � j: " + i + " " + j );
    }
}
// �������� ��������� ����� ���������� ������ AA
class BB extends AA{
    int k;

    BB (int a, int b, int c){
        super(a, b);
        k = c;
    }

  //����������� ���������� k - ��������������� ������ show() � AA
    void show(){
        super.show();
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        BB subOb = new BB(1, 2, 3);

        subOb.show(); // ����� ������ show �� ������ BB
    }
}