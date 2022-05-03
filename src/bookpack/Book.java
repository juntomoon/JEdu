// ������� ���������, ��������������� ���������� �������
package bookpack;

public class Book {
    // ��� ���������� ���� ���������� �����������
    // ����������� ������� protected
    protected String title;
    protected String author;
    protected int pubDate;
// ������ ����������� ���� ��������
    public Book(String t, String a, int d) {
        title = t ;
        author = a;
        pubDate = d;
    }
    // ������ ����� ���� ��������
    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java: ����������� ��� ����������, 7-� �������", "������� �����", 2018);
        books[1] = new Book("Java: ������ �����������, 10-� �������", "������� �����", 2018);
        books[2] = new Book("��������� ���������������� �� Java", "������� �����", 2005);
        books[3] = new Book("������� ����� �����������", "��� ������", 2006);
        books[4] = new Book("� ������", "���� ������", 2012);

        for (int i = 0; i < books.length; i++) books[i].show();
    }
}
