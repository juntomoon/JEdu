/*
Демонстрация применения блоков кода.
Присвойте файлу с исходным кодом имя BlockDemo.java
 */
package javaeducation;

class Blockdemo2 {

    public static void main(String[] args) {
        double i, j, d;
        i = 0;
        j = 10;
        // Телом этой инструкции if является целый блок кода
        if (i != 0) {
            System.out.println("i не равно нулю");
            d = j / i;
            System.out.print("j / i равно " + d);
        }
    }
}
