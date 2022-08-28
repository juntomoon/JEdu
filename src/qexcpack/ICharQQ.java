package qexcpack;

// Интерфейс для очереди символов
public interface ICharQQ {
    // Помещение символа в очередь
    void put(char ch) throws QueueFullException;

    // Извлечение символа из очереди
    char get() throws QueueEmptyException;

}