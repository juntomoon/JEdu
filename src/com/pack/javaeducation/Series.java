package com.pack.javaeducation;
// Реализация интерфейса Series
public interface Series{
    int getNext(); // возврат следующего по порядку числа
    void reset(); // сброс
    void setStart(int x); // установка начального значения
}
class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
        }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
class ByThrees implements Series {
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset(){
        start = 0;
        val = 0;
    }
    public void setStart(int x){
        start = x;
        val = x;
    }
}
    class SeriesDemo2 {
        public static void main(String[] args) {
            ByTwos twoOb = new ByTwos();
            ByThrees threeOb = new ByThrees();
            Series ob;

            for (int i = 0; i < 5; i++){
                ob = twoOb;
                System.out.println("Следующее значение ByTwos: " + ob.getNext());

                ob = threeOb;
                System.out.println("Следующее значение Next ByThrees: " + ob.getNext());
            }

        }
    }