package com.pack.javaeducation;

// ������� �������� �������

// �����, ����������� ��������� �������
class TwoDD {
    private double width;
    private double height;

    // ����������� �������� �� ���������
    TwoDD() {
        width = height = 0;
    }

    // ����������������� �����������
    TwoDD(double w, double h) {
        width = w;
        height = h;
    }

    // �������� ������� � ����������� ����������
    // ���������� ���������� width � height
    TwoDD(double x){
        width = height = x;
    }

    // ������ ������� � ���������� ���������� width � height
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}

    void showDim() {
        System.out.println("������ � ������ - " + width + " � " + height);
    }
}

// �������� ��� ������������� �������������,
// ����������� �� ������ TwoDShape {
class Triangles extends TwoDD {
    private String style;

    // ����������� �� ���������
    Triangles() {
        super(); // ����� ������������ ����������� �� ���������
        style = "none";
    }
    // �����������
    Triangles(String s, double w, double h) {
        super (w, h); // ����� ������������ � ����� �����������

        style = s;
    }
    // ����������� � ����� ����������
    Triangles(double x) {
        super(x); //����� ������������ ����������� � ����� ����������

        style = "�����������";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showstyle() {
        System.out.println("����������� - " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangles t1 = new Triangles();
        Triangles t2 = new Triangles("���������", 8.0, 12.0);
        Triangles t3 = new Triangles(4.0);

        t1 = t2;

        System.out.println("���������� � t1:  ");
        t1.showstyle();
        t1.showDim();
        System.out.println("������� - " + t1.area());

        System.out.println();

        System.out.println("���������� � t2: ");
        t2.showstyle();
        t2.showDim();
        System.out.println("������� - " + t2.area());

        System.out.println();

        System.out.println("���������� � t3: ");
        t3.showstyle();
        t3.showDim();
        System.out.println("������� - " + t3.area());

        System.out.println();
    }
}