package javaeducation;
/*
������� ���������� �������.

 */
class Helppp {

    public static void main(String[] args)
        throws java.io.IOException{

        char choise; //�����

        System.out.println("�������:");
        System.out.println("  1. if");
        System.out.println(" 2. switch");
        System.out.print("��������:  ");
        choise = (char) System.in.read();

        System.out.println("\n");

        switch (choise) {
            case '1' :
                System.out.println("����������� if:\n");
                System.out.println("if(�������) ����������;");
                System.out.println("else ����������;");
                break;
            case '2':
                System.out.println("���������� switch:\n");
                System.out.println("switch(���������) {");
                System.out.println(" case ���������:");
                System.out.println("   ������������������ ����������");
                System.out.println("  //...");
                System.out.println("}");
                break;
            default:
                System.out.print("������ �� ������.");
        }
    }
}
