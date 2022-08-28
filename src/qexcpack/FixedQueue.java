package qexcpack;
// Класс очереди фиксированного размера для символов, использующий исключения.
public class FixedQueue implements ICharQQ{
    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

    // Создание пустой очереди заданного размера
    public FixedQueue(int size) {
        q = new char[size]; // выделение памяти для очереди
        putloc = getloc = 0;
    }
    // Помещение символа в очередь
    public void put(char ch) throws QueueFullException {

        if(putloc==q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = ch;
    }
    // Извлечение символа из очереди
    public char get() throws QueueEmptyException {
        if(getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
