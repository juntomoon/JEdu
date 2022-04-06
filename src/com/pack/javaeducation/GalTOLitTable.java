//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pack.javaeducation;

class GalTOLitTable {

    public static void main(String[] args) {
        int counter = 0;
        float metr,duym;
        for(duym = 1; duym <= 144.0f; ++duym) {
            metr = duym * 0.3937f;
            System.out.println(metr + " м = " + duym + " дюйм");
            ++counter;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
