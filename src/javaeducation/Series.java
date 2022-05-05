package javaeducation;

// ���������� ���������� Series
public interface Series {

    int getNext(); // ������� ���������� �� ������� �����

    // ������� �������, ������� �������� n ���������,
    // ���������������� � ���� ����� �� ������� ���������
    default int[] getNextArray(int n){
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
    }
    void reset(); // �����

    void setStart(int x); // ��������� ���������� ��������
}

