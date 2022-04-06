package com.pack.javaeducation;

class LogicalOpTable {
    public static int toInt(boolean b) {
        return b ? 1 : 0;
    }
    public static void main(String[] args) {
	    boolean p, q;

	    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(toInt(p) + "\t" + toInt(q) + "\t");
        System.out.print((toInt(p)&toInt(q)) + "\t" + (toInt(p)|toInt(q)) + "\t");
        System.out.println((toInt(p)^toInt(q)) + "\t" + (toInt(!p)));

        p = true; q = false;
        System.out.print(toInt(p) + "\t" + toInt(q) + "\t");
        System.out.print((toInt(p)&toInt(q)) + "\t" + (toInt(p)|toInt(q)) + "\t");
        System.out.println((toInt(p)^toInt(q)) + "\t" + (toInt(!p)));

        p = false; q = true;
        System.out.print(toInt(p) + "\t" + toInt(q) + "\t");
        System.out.print((toInt(p)&toInt(q)) + "\t" + (toInt(p)|toInt(q)) + "\t");
        System.out.println((toInt(p)^toInt(q)) + "\t" + (toInt(!p)));

        p = false; q = false;
        System.out.print(toInt(p) + "\t" + toInt(q) + "\t");
        System.out.print((toInt(p)&toInt(q)) + "\t" + (toInt(p)|toInt(q)) + "\t");
        System.out.println((toInt(p)^toInt(q)) + "\t" + (toInt(!p)));

    }
}
