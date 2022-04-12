package com.pack.javaeducation;
/*  Добавление параметризированного методо fuelneeded в котором выполняется
    расчет объема топлива, необходимого транспортному средству
    для  преодоления заданного расстояния
 */

class Vehicle2 {
    int passengers;     // Количество пассажиров
    int fuelcap;        // Емкость топливного бака
    int mpg;            //потребления топлива в милях на галлон

    //Это конструктор класса Vehicle
    Vehicle2(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Определения дальности поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Расчет объема топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
    class VehConsDemo {
        public static void main(String[] args) {

            // Завершение создания объектов транспортных средств
            Vehicle2 minivan = new Vehicle2(7, 16, 21);
            Vehicle2 sportscar = new Vehicle2(2, 14, 12);
            double gallons;
            int dist = 252;

            gallons = minivan.fuelneeded(dist);
            System.out.println("Для преодоления " + dist + " миль, мини-фургону требуется " + gallons + " галлонов топлива");

            gallons = sportscar.fuelneeded(dist);
            System.out.println("Для преодоления " + dist + " миль, спортивному автомобилю требуется " + gallons + " галлонов топлива");

        }
    }