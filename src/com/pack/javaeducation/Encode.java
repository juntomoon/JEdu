package com.pack.javaeducation;
//Использование побитовой операции исключающего ИЛИ
// для шифрования и дешифрования сообщений
class Encode {
    public static void main(String[] args) {
    String msg = "Это просто тест.";
    String encmsg = "";
    String decmsc = "";
    int key = 55;

        System.out.print("Исходное сообщение :");
        System.out.println(msg);

        // Шифрование сообщения
        for(int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Зашифрованное сообщение : ");
        System.out.println(encmsg);

        //Дешифровка сообщения
        for(int i = 0; i < encmsg.length(); i++)
            decmsc = decmsc + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Дешифрованное сообщение : ");
        System.out.println(decmsc);
    }
}
