package com.pack.javaeducation;


class Vehicle5 {
    int passengers; // ���������� ����������
    int fuelcap; // ������� ���������� ����
    int mpg; // ����������� ������� � ����� �� ������

    // ������� ��������� �������
    int range() {
        return mpg * fuelcap;
    }
}
class RetMeth {
    public static void main(String[] args) {
        Vehicle5 minivan = new Vehicle5();
        Vehicle5 sportscar = new Vehicle5();

        int range1, range2;

        // ������������ �������� ����� ������� minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //������������ �������� ����� ������� sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        System.out.println("����-������ ����� ��������� " + minivan.passengers + " ���������� �� ���������� " + minivan.range()+ " ����");
        System.out.println("���������� ���������� ����� ��������� " + sportscar.passengers + " ���������� �� ���������� " + sportscar.range() + " ����");
    }
}
