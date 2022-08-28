package qexcpack;
// Исключение для ошибок, связанных с пустой очередью
public class QueueEmptyException extends Exception{
    public String toSting() {
        return "\nОчередь пуста.";
    }
}