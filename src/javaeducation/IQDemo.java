package javaeducation;

// ����� ����������� ������� �������������� �������
// ��� �������� ��������
class FixedQueue implements ICharQ {
    private char[] q; // ������ ��� �������� ��������� �������
    private int putloc, geloc; // ������� ����������� � ����������� ���������

    // �������� ������ ������� ��������� �������
    public FixedQueue(int size) {
        q = new char[size]; // ��������� ������ ��� �������
        putloc = geloc = 0;
    }

    // ��������� ������� � �������
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - ������� ���������");
            return;
        }

        q[putloc++] = ch;
    }

    // ���������� ������� �� �������
    public char get() {
        if (geloc == putloc) {
            System.out.println(" - ������� �����");
            return (char) 0;
        }
        return q[geloc++];
    }

    // ����� �������
    public void reset() {
        q[putloc] = 0;
    }
}

// ��������� �������
class CircularQueue implements ICharQ {
    private char[] q;// ������ ��� �������� ��������� �������
    private int putloc, getloc; // ������� ����������� � ����������� ���������

    // �������� ������ ������� ��������� �������
    public CircularQueue(int size) {
        q = new char[size + 1]; // ��������� ������ ��� �������
        putloc = getloc = 0;
    }

    // ��������� ������� � �������
    public void put(char ch) {
// ������� ��������� ������, ���� ������ putloc �� ������� ������
// ������� getloc ��� ���� ������ putloc ��������� �� ����� �������,
// � ������ getloc - �� ��� ������
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - ������� ���������");
            return;
        }
        putloc++;
        if (putloc == q.length) putloc = 0;// ������� � ������ �������
        q[putloc] = ch;
    }

    //���������� ������� �� �������
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - ������� �����");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; // ��������� � ������ �������
        return q[getloc];
    }

    // ����� �������
    public void reset() {
        q[putloc] = 0;
    }
}

// ������������ �������
class DynQueue implements ICharQ {
    private char[] q; // ������ ��� �������� ��������� �������
    private int putloc, getloc; // ������� ����������� � ����������� ���������

// �������� ������ ������� ��������� �������
    public DynQueue(int size) {
        q = new char[size]; // ��������� ������ ��� �������
        putloc = getloc = 0;
    }

    // ��������� ������� � �������
    public void put(char ch) {
        if (putloc == q.length) {
            // ���������� ������� �������
            char[] t = new char[q.length * 2];

            // ����������� ��������� � ����� �������
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }
        q[putloc++] = ch;
    }

    // ���������� ������� �� �������
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - ������� �����");
            return (char) 0;
        }
        return q[getloc++];
    }

    // ����� �������
    public void reset() {
        q[putloc] = 0;
    }
}

// ������������ ���� ���������� ���������� ICharQ
class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
// ��������� ���� �������� � ������� �������������� �������
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

// ����������� ����������� �������
        System.out.print("���������� ������������� �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
// ��������� ���� �������� � ������������ �������
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

// ���������� ����������� �������
        System.out.print("���������� ������������ �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
// ��������� ���� �������� � ��������� �������
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

// ����������� ����������� �������
        System.out.print("���������� ��������� �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();
// ��������� �������������� �������� � ��������� �������
        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

// ����������� ����������� �������
        System.out.print("���������� ��������� �������: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\n���������� � ������������� ������ ��������� �������.");

// ��������� �������� � ��������� ������� � ����������� �� �����������
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\n�������� ������� ������� ����� reset.");
// reset
        iQ.reset();
        ch = iQ.get();
    }
}
