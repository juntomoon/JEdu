package javaeducation;
/* Методы с разными сигнатурами не переопределяются,
 а перезагружаются */
class AA {
    int i, j;

    AA (int a, int b) {
        i = a;
        j = b;
    }
    // Отображение переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j );
    }
}
// Создание подкласса путем расширения класса AA
class BB extends AA{
    int k;

    BB (int a, int b, int c){
        super(a, b);
        k = c;
    }

  //Отображение переменной k - переопределение метода show() в AA
    void show(){
        super.show();
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        BB subOb = new BB(1, 2, 3);

        subOb.show(); // вызов метода show из класса BB
    }
}