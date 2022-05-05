package javaeducation;

public interface MyIF {
    // ќбъ€вление обычного интерфейса которое не включает
    // определение реализации по умолчанию
    int getUserID();

    // ќбъ€вление метода по умолчанию, включающее его реализацию
    default int getAdminID(){
        return 1;
    }
}
