package com.pack.javaeducation;
// Интерфейс для очереди символов
 interface ICharQ {
    // Помещение символа в очередь
    void put(char ch);
    // Извлечение символа из очереди
    char get();
    // Сброс очедеи
    void reset();
}
