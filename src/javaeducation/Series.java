package javaeducation;

// Реализация интерфейса Series
public interface Series {

    int getNext(); // возврат следующего по порядку числа

    // Возврат массива, который содержит n элементов,
    // располашгающахся в ряду вслед за текущим элементом
    default int[] getNextArray(int n){
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
    }
    void reset(); // сброс

    void setStart(int x); // установка начального значения
}

