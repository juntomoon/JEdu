package com.pack.javaeducation;
/*
    ���������� 7.1
    �������� ��������� ������ Vehicle ��� ����������
 */
class Vehicle3 {
    private int passengers;     // ���������� ����������
    private int fuelcap;        // ����� ���������� ���� (� ��������)
    private int mpg;            // ����������� �������(� ����� �� ������)

    // ����������� ������ Vehicle
    Vehicle3(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // ��������� ������� ������������� ��������
    int range() {
        return mpg * fuelcap;
    }

    // ���������� ������ �������, ����������
    // ��� ����������� ��������� ����
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
class Truck extends Vehicle2 {
    private int cargocap; // ����������������, ���������� � ������

    // ����������� ������ Truck
    Truck (int p, int f, int m, int c){
        // ������������� ������ ������ Vehicle
        // � �������������� ������������ ����� ������
        super(p, f, m);

        cargocap = c;
    }

    // ������ ������� � ���������� cargocap
    int getCargo () { return cargocap; }
    void putCargo (int c) { cargocap = c;}
}
class TruckDemo {
    public static void main(String[] args) {
        // �������� ���� ����� �������� ���� Truck
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck (3, 28 , 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("�������� ����� ��������� " + semi.getCargo() + " ������");
        System.out.println("��� ����������� " + dist + " ���� ��������� ��������� " + gallons
                + " �������� �������.\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("����� ����� ��������� " + pickup.getCargo() + " ������");
        System.out.println("��� ����������� " + dist + " ���� ������ ��������� " + gallons
                + " �������� �������.");
        }
    }
