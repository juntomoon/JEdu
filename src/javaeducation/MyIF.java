package javaeducation;

public interface MyIF {
    // ���������� �������� ���������� ������� �� ��������
    // ����������� ���������� �� ���������
    int getUserID();

    // ���������� ������ �� ���������, ���������� ��� ����������
    default int getAdminID(){
        return 1;
    }
}
