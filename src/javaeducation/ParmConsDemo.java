package javaeducation;

class Myclass5{
    int x;

    Myclass5(int i){
        x = i;
    }
}

class ParmConsDemo {
    public static void main(String[] args) {
        Myclass5 t1 = new Myclass5(10);
        Myclass5 t2 = new Myclass5(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
