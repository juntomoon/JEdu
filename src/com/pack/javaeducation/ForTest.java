package com.pack.javaeducation;

class ForTest {
    public static void main(String[] args)
        throws java.io.IOException {

            int i;

            System.out.println("��� ��������� ������� ������� S");
            for (i = 0; (char) System.in.read() != 'S'; i++)
                System.out.println(" ������ # " + i);
        }
    }
