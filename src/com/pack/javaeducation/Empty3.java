package com.pack.javaeducation;

class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        // суммируются числа от 1 до 5
        for(i = 1; i <= 5; sum +=  i++);
        System.out.println("Сумма: " + sum);
    }
}
