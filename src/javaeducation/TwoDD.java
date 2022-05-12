package javaeducation;

// Простая иерархия классов

// Класс, описывающий двумерные объекты
class TwoDD {
    private double width;
    private double height;

    // Конструктор заданный по умолчанию
    TwoDD() {
        width = height = 0;
    }

    // Параметризованный конструктор
    TwoDD(double w, double h) {
        width = w;
        height = h;
    }

    // Создание объекта с одинаковыми значениями
    // переменных экземпляра width и height
    TwoDD(double x){
        width = height = x;
    }

    // Методы доступа к переменным экземпляра width и height
    double getWidth() {return width;}
    double getHeight() {return height;}
    void setWidth(double w) {width = w;}
    void setHeight(double h) {height = h;}

    void showDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape {
class Triangles extends TwoDD {
    private String style;

    // Конструктор по умолчанию
    Triangles() {
        super(); // Вызов конструктора суперкласса по умолчанию
        style = "none";
    }
    // Конструктор
    Triangles(String s, double w, double h) {
        super (w, h); // Вызов конструктора с двумя аргументами

        style = s;
    }
    // Конструктор с одним аргументом
    Triangles(double x) {
        super(x); //вызов конструктора суперкласса с одним аргументом

        style = "Закрашенный";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showstyle() {
        System.out.println("Треугольник - " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangles t1 = new Triangles();
        Triangles t2 = new Triangles("Контурный", 8.0, 12.0);
        Triangles t3 = new Triangles(4.0);

        t1 = t2;

        System.out.println("Информация о t1:  ");
        t1.showstyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showstyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t3.showstyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());

        System.out.println();
    }
}