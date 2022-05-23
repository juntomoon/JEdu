package javaeducation;
// Обработка ошибка средствами виртуальной машины Java
class NotHandled {
    public static void main(String[] args) {
        int[] nums = new int[4];

        System.out.println("До генерации исключения");
        // Сгенерировать исключение в связи с выходом за пределы массива
        nums[7] = 10;
    }
}
