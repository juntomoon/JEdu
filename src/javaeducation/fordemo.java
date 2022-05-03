/*
Демонстрация применения цикла for.
 Присвойте файлу с исходным кодом имя fordemo.java
 */
package javaeducation;

class fordemo {

    public static void main(String[] args) {
	int count;
	for (count = 0; count < 5; count ++) //Выполняется 5 итераций до значения count = 5
        System.out.println("Значение счетчика: " + count);
	System.out.println("Готово");

    }

}
