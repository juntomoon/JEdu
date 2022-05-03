package javaeducation;

// Класс реализующий очередь фиксированного размера
// для хранения символов
class FixedQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, geloc; // индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public FixedQueue(int size) {
        q = new char[size]; // выделение памяти для очереди
        putloc = geloc = 0;
    }

    // Помещение символа в очередь
    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() {
        if (geloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[geloc++];
    }

    // Сброс очереди
    public void reset() {
        q[putloc] = 0;
    }
}

// Кольцевая очередь
class CircularQueue implements ICharQ {
    private char[] q;// массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public CircularQueue(int size) {
        q = new char[size + 1]; // выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    public void put(char ch) {
// Очередь считается полной, если индекс putloc на единицу меньше
// индекса getloc или если индекс putloc указывает на конец массива,
// а индекс getloc - на его начало
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        if (putloc == q.length) putloc = 0;// перейти в начало массива
        q[putloc] = ch;
    }

    //Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; // вернуться в начало очереди
        return q[getloc];
    }

    // Сброс очереди
    public void reset() {
        q[putloc] = 0;
    }
}

// Динамическая очередь
class DynQueue implements ICharQ {
    private char[] q; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

// Создание пустой очереди заданного размера
    public DynQueue(int size) {
        q = new char[size]; // выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    public void put(char ch) {
        if (putloc == q.length) {
            // Увеличение размера очереди
            char[] t = new char[q.length * 2];

            // Копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }
        q[putloc++] = ch;
    }

    // Извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }

    // Сброс очереди
    public void reset() {
        q[putloc] = 0;
    }
}

// Демонстрация трех реализаций интерфейса ICharQ
class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
// Помещение ряда символов в очередь фиксированного размера
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

// Отображение содержимого очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
// Помещение ряда символов в динамическую очередь
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

// Отображене содерижмого очереди
        System.out.print("Содержимое динамической очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
// Помещение ряда символов в кольцевую очередь
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

// Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();
// Помещение дополнительных символов в кольцевую очередь
        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

// Отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nСохранение и использование данных кольцевой очереди.");

// Помещение символов в кольцевую очередь с последующим их извлечением
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nПроверка пустоты очереди после reset.");
// reset
        iQ.reset();
        ch = iQ.get();
    }
}
