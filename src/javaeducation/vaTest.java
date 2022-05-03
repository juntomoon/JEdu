package javaeducation;

// ������������ ������������� ������
// � ���������� ������ ����������
class VarArgs {

    // ����� vaTest() ��������� ���������� ����� ����������
    static void vaTest(int ... v){
        System.out.println("���������� ����������: " + v.length);
        System.out.println("����������: ");

        for (int i =0; i < v.length; i++)
            System.out.println("arg " + i + ": " + v[i]);

        System.out.println();
        
    }
    public static void main(String[] args) {
        // ����� vaTest() ����� ���������� �
        // ���������� ������ ����������
        vaTest(10); // 1 ��������
        vaTest(1, 2, 3); // 3 ���������
        vaTest(); // ��� ����������
}
}