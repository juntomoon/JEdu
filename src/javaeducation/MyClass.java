package javaeducation;

public class MyClass {
    private int alpha; // закрытый доступ
    public int beta; //открытый доступ
    int gamma; // тип доступа по умолчанию ( по сути, public)

    // ћетоды доступа к перменной alpha. „лены класса могут
// обращатьс€ к закрытым членам того же класса.
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        // ƒоступ к переменной alpha возможен только с помощью
        // специально предназначенных дл€ этой цели методов
        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        // ќбращение к переменной alpha, так, как показано ниже,
        // недопустимо
        // ob.alpha = 10; //ќшибка: alpha - закрыта€ переменна€!

        // —ледующие обращени€ считаютс€ вполне допустимы, так как
        // переменные beta и gamma €вл€ютс€ открытыми
        ob.beta = 88;
        ob.gamma = 99;
    }
}
