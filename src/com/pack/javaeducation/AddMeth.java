package com.pack.javaeducation;

class Vehicle4 {
    int passengers; // ���������� ���������
    int fuelcap; // ������� ���������� ����
    int mpg; // ����������� ������� � ����� �� ������

    // ����������� ��������� ������� ������������ ��������
    void range() {
        System.out.println("��������� - " + fuelcap * mpg + " ����.");
    }
}
class AddMeth {
    public static void main(String[] args) {
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportscar = new Vehicle4();

        int range1, range2;

        // ������������ ����� ��������  ������� minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // ������������ �������� ����� ������� sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("����-������ ����� ��������� " + minivan.passengers + " ����������. ");
        minivan.range(); // ����������� ���������� � ��������� ������� ����-�������
        System.out.print("���������� ���������� ����� ��������� " + sportscar.passengers + " ����������.  ");
        sportscar.range(); // ����������� ��������� ������� ����������� ����������
    }
}
