package com.pack.javaeducation;

class BreakDemo {

    public static void main(String[] args) {
        int num = 100;

        //���������� ����� �� ��� ���, ���� ������� ��������
        // ���������� i ������ �������� ���������� num
        for (int i = 0; i < num; i++) {
            if (i * i >= num) break; // ����������� ���������� �����;
            // ���� i*i >= 100
            System.out.print(i + " ");

        }
        System.out.println("���� ��������.");
    }
}