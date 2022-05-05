package javaeducation;
// Реализация интерфейса MyIF
class MyIFImp implements MyIF {
    // Реализации подлежит лишь метод getUserID() интерфейса MyIF
    // Делать это для метода getAdminID() необязательно, поскольку\
    // при необходимости может быть использована его реализация
    // заданная по умолчанию
    public int getUserID(){
        return 100;
    }
}
class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        // Вызов метода getUserID() возможен, поскольку он ясвно
        // реализован классом MyIFImp
        System.out.println("Идентификатор пользователя: " + obj.getUserID());

        // Вызов метода getAdminID() также возможен, поскольку
        // предоставляеться его реализация по умолчанию
        System.out.println("Идентификатор администратора: " + obj.getAdminID());
    }
}
