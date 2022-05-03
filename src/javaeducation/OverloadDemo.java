package javaeducation;
//  ���������� �������
class Overload {
    void ovlDemo() {
        System.out.println("��� ����������");
    }

    // ���������� ������ ovlDemo ��� ������ ��������� ���� int
    void ovlDemo(int a) {
        System.out.println("���� ��������: " + a);
    }

    // ��������� ������ ovlDemo ��� ���� ���������� ���� int
    int ovlDemo(int a, int b) {
        System.out.println("��� ���������: " + a + " " + b);
        return a + b;
    }

    //���������� ������ ovlDemo ��� ���� ���������� ���� double
    double ovlDemo(double a, double b) {
        System.out.println("��� ��������� ���� double: " + a +  " " + b);
        return a + b;
    }
}
    class OverloadDemo {
        public static void main(String[] args) {
            Overload ob = new Overload();
            int resI;
            double resD;

            // ����������� ����� ���� ������ ������ ovlDemo()
            ob.ovlDemo();
            System.out.println();

            ob.ovlDemo(2);
            System.out.println();

            resI = ob.ovlDemo(4, 6);
            System.out.println("��������� ������ ob.ovlDemo(4, 6): " + resI);
            System.out.println();

            resD = ob.ovlDemo(1.1, 2.32);
            System.out.println("��������� ������ ob.ovlDemo(1.1, 2.32): " + resD);
            System.out.println();
        }
    }

