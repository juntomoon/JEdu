//������������� ��������� ����� import
package javaeducaton.bookpackext;
import  bookpack.*;

//������������� ������ Book �� ������ bookpack
class UseBook {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java: ����������� ��� ����������, 7-� �������", "������� �����", 2018);
        books[1] = new Book("Java: ������ �����������, 10-� �������", "������� �����", 2018);
        books[2] = new Book("��������� ���������������� �� Java", "������� �����", 2005);
        books[3] = new Book("������� ����� �����������", "��� ������", 2006);
        books[4] = new Book("� ������", "���� ������", 2012);

        for (int i = 0; i < books.length; i++){
            books[i].show();
        }
    }
}
