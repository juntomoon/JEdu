package com.pack.javaeducation;


class Vehicle5 {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // Возврат дальности поездки
    int range() {
        return mpg * fuelcap;
    }
}
class RetMeth {
    public static void main(String[] args) {
        Vehicle5 minivan = new Vehicle5();
        Vehicle5 sportscar = new Vehicle5();

        int range1, range2;

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присваивание значения полям объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + minivan.range()+ " миль");
        System.out.println("Спортивный автомобиль может перевезти " + sportscar.passengers + " пассажиров на расстояние " + sportscar.range() + " миль");
    }
}
