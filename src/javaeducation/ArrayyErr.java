package javaeducation;
// ���������� ����� �� ������� �������
class ArrayyErr {
    public static void main(String[] args) {
        int [] sample = new int [10];
        int i;

        // �������� ������ �� ������� �������
        for (i = 0; i < 11; i++)
            sample[i] = i;
    }
}
