package javaeducation;
// Демонстрация очередности вызова конструкторов

// Создание суперкласса
class AB {
    AB(){
        System.out.println("Конструктор A");
    }
}

// Создание подкласса в результате расширения класса A
class BC extends AB {
    BC() {
        System.out.println("Конструктор B");
    }
}

class CD extends BC {
    CD () {
        System.out.println("Конструктор C");
    }
}

class OrderOfConstriction {
    public static void main(String[] args) {
        CD c = new CD();
    }
}
