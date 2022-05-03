package javaeducation;
/* ћетоды с разными сигнатурами не переопредел€ютс€,
 а перезагружаютс€ */
class AA {
    int i, j;

    AA (int a, int b) {
        i = a;
        j = b;
    }
    // ќтображение переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j );
    }
}
// —оздание подкласса путем расширени€ класса AA
class BB extends AA{
    int k;

    BB (int a, int b, int c){
        super(a, b);
        k = c;
    }

  //ќтображение переменной k - переопределение метода show() в AA
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