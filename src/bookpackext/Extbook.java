// ������ ������������� ������������ protected
package bookpackext;

import bookpack.Book;

class Extbook extends Book {
    private String publisher;

    public Extbook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    // ��������� ���������� ���������, ��������� ��������� �����
// ����� ������� � ������ ������, ����������� �����������
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int d) {
        pubDate = d;
    }

}

class ProtectDemo {

    public static void main(String[] args) {

        Extbook[] books = new Extbook[5];
        books[0] = new Extbook("Java: ����������� ��� ����������, 7-� �������", "������� �����", 2018, "�������");
        books[1] = new Extbook("Java: ������ �����������, 10-� �������", "������� �����", 2018, "�������");
        books[2] = new Extbook("��������� ���������������� �� Java", "������� �����", 2005, "����������");
        books[3] = new Extbook("������� ����� �����������", "��� ������", 2006, "�����");
        books[4] = new Extbook("� ������", "���� ������", 2012, "������");

        for (int i = 0; i < books.length; i++) books[i].show();

        // ����� ���� �� ������
        System.out.println("��� ����� �������� ������");
        for (int i = 0; i < books.length; i++)
            if (books[i].getAuthor() == "������� �����")
                System.out.println(books[i].getTitle());

        //books[0].title = "test title"; // ������: ������ ��������!
    }
}
