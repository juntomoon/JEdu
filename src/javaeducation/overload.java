package javaeducation;

// Переорпеделение метода
class AAAA{
    int i, j;

    AAAA(int a, int b){
        i = a;
        j = b;
    }
    // Отображение переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}
    class BBBB extends AAAA {
    int k;

    BBBB(int a, int b, int c){
        super(a ,b);
        k = c;
    }
    // Перегрузка метода show()
        void show(String msg) {
            System.out.println(msg + k);
        }
    }
class overload {
    public static void main(String[] args) {
        BBBB subOb = new BBBB(1, 2 ,3);

        subOb.show("k: "); // вызов метода show() из класса BBBB
        subOb.show(); // вызов метода show() из класса AAAA
      }
}