package com.pack.javaeducation;

// �������������� ��������
abstract  class TwoDShape {
    private double width;
    private double height;
    private String name;

    // ����������� �� ���������
    TwoDShape() {
        width = height = 0.0;
        name = "none";
    }

    // ����������������� �����������
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // �������� ������� � ����������� ����������
    // ���������� ���������� width � height
    TwoDShape(double x,String n) {
        width = height = x;
        name = n;
    }
    // �������� ������ ������� �� ������ �������
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // ������ ������� � ���������� ���������� width � height
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("������ � ������ - " + width + " � " + height);
    }
    // ������ ����� area() �����������
    abstract double area();
}
// ���������� ������ TwoDShape
    class Triangle extends TwoDShape{
        private String style;

        // ����������� �� ���������
        Triangle() {
            super();
            style = "none";
        }
        // ����������� ������ Triangle
        Triangle(String s, double w, double h) {
            super(w, h,"�����������"); // ����� ������������ �����������
            style = s;
        }
        // ����������� � ����� ���������� ��� ���������� ������������
        Triangle(double x) {
            super(x, "�����������"); // ����� ������������ �����������

            style = "�����������";
        }

        // �������� ������ ������� �� ������ �������
        Triangle(Triangle ob) {
            super(ob);
            style = ob.style;
        }
        double area() {
            return getWidth() * getHeight() / 2;
        }
        void showStyle() {
            System.out.println("����������� " + style );
        }
    }
    // �������� ��� ������������� ���������������,
    // ����������� �� ������ TwoDShape
    class Rectangle extends TwoDShape {
        // ����������� �� ���������
        Rectangle() {
            super();
        }

        // ����������� ������ Rectangle
        Rectangle(double w, double h) {
            super(w, h, "�������������"); // ����� ������������ �����������
        }

        // �������� ��������
        Rectangle(double x) {
            super(x, "�������������"); // ����� ������������ �����������
        }

        // �������� ������ ������� �� ������ �������
        Rectangle(Rectangle ob) {
            super(ob); // �������� ������� ������������ ������ TwoDShape
        }

        boolean isSqure() {
            if (getWidth() == getHeight()) return true;
            return false;
        }

        // ��������������� ������ area() ��� ������ Rectangle
        double area() {
            return getWidth() * getHeight();
        }
    }
  class DynShapes {
      public static void main(String[] args) {
          TwoDShape [] shapes = new TwoDShape[4];

          shapes[0] = new Triangle("���������", 8.0,12.0);
          shapes[1] = new Rectangle(10);
          shapes[2] = new Rectangle(10,4);
          shapes[3] = new Triangle(7.0);

          for (int i = 0; i < shapes.length; i++) {
              System.out.println("������ - " + shapes[i].getName());
              System.out.println("������� - " + shapes[i].area());
              System.out.println();
          }
      }
  }