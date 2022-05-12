package javaeducation;
/*
Усовершенствованный класс очереди, предназначенной
для хранения символьных значений
 */
class Queue3{
// Эти члены класса теперь являются закрытыми
    private char[]q; //Массив для хранения элементов очереди
    private int putloc,getloc; //индексы для вставки и извлечения элементов очереди

    Queue3(int size){
        q = new char[size]; // Выделение памяти для очереди
        putloc = getloc = 0;
    }

    //Помещение символа в очередь
    void put(char ch){
        if(putloc==q.length-1){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }
    //Извлечение символа из очереди
    char get(){
        if(getloc==putloc){
            System.out.println(" - Очередь пуста");
            return(char) 0;
        }
        return q[getloc++];
    }
}
class QDemo2{
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для " +
                "сохранения алфавита");
        // Помещение буквенных символов в очередь bigQ
        for (i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        //Извлечение и отображние буквенных символов из очереди bigQ
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ" +
                " для генерации ошибок: ");
        // Использование очереди smallQ для генерации ошибок
        for (i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));

            smallQ.put((char) ('Z' - i));

            System.out.println();
        }
        System.out.println();

        //Дополнительные ощибки при обращении к очереди smallQ
        System.out.print("Содержимое очереди smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch);
        }
    }
}

