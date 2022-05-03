package javaeducation;
// Намеренный выход за пределы массива
class ArrayyErr {
    public static void main(String[] args) {
        int [] sample = new int [10];
        int i;

        // Имитация выхода за пределы массива
        for (i = 0; i < 11; i++)
            sample[i] = i;
    }
}
