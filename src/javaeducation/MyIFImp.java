package javaeducation;
// ���������� ���������� MyIF
class MyIFImp implements MyIF {
    // ���������� �������� ���� ����� getUserID() ���������� MyIF
    // ������ ��� ��� ������ getAdminID() �������������, ���������\
    // ��� ������������� ����� ���� ������������ ��� ����������
    // �������� �� ���������
    public int getUserID(){
        return 100;
    }
}
class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        // ����� ������ getUserID() ��������, ��������� �� �����
        // ���������� ������� MyIFImp
        System.out.println("������������� ������������: " + obj.getUserID());

        // ����� ������ getAdminID() ����� ��������, ���������
        // ���������������� ��� ���������� �� ���������
        System.out.println("������������� ��������������: " + obj.getAdminID());
    }
}
