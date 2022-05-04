package javaeducation;

// ������������ �����������
interface A {
    void meth1();

    void meth2();
}

// ��������� B �������� ������ meth1() � meth2(),
// � ����� ����, � ���� ����������� ����� meth3()
interface B extends A {
    void meth3();
}

// ���� ����� ������ ������������� ��� ������,
// ����������� � ����������� A � B
class Myclass implements B {
    public void meth1() {
        System.out.println("���������� ������ meth1().");
    }

    public void meth2() {
        System.out.println("���������� ������ meth2().");
    }

    public void meth3() {
        System.out.println("���������� ������ meth3().");
    }
}

class IFExtend {
    public static void main(String[] args) {

        Myclass ob = new Myclass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
