package qpack;

// Интерфейс для очереди символов
public interface ICharQ {
    // Помещение символа в очередь
    void put(char ch);

    // Извлечение символа из очереди
    char get();

    // Сброс очереди
    void reset();
}