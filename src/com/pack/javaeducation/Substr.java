package com.pack.javaeducation;

class Substr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";

        //Сфомировать подстроку
        String substr = orgstr.substring(7, 26);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
