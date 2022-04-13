package com.pack.javaeducation;

class Vehicle6 {
    int passengers; // ���������� ����������
    int fuelcap; // ������� ���������� ����
    int mpg; // ����������� ������� � ����� �� ������

    // ����������� ��������� ������� ������������� ��������
    int range () {
        return mpg * fuelcap;
    }
    // ������ ���������� �������, ������������
    // ������������� �������� ��� ����������� �������� ����������
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle6 minivan = new Vehicle6();
        Vehicle6 sportscar = new Vehicle6();
        double gallons;
        int dist =  252;

        // ������������ �������� ����� ������� sportscar
        minivan.passengers = 2;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // ������������ �������� ����� ������� sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("��� ����������� " + dist + " ���� ����-������� ��������� " + gallons + " �������� �������");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("��� ���������� " + dist + " ���� ����������� ���������� ��������� " + gallons + " �������� �������");
    }
}
