package com.pack.javaeducation;
/*  Добавление параметризированного методо fuelneeded в котором выполняется
    расчет объема топлива, необходимого транспортному средству
    для  преодоления заданного расстояния
 */

class Vehicle {
    int passengers;     // Количество пассажиров
    int fuelcap;        // Емкость топливного бака
    int mpg;            //потребления топлива в милях на галлон

    //Это конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
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
            Vehicle minivan = new Vehicle(7, 16, 21);
            Vehicle sportscar = new Vehicle(2, 14, 12);
            double gallons;
            int dist = 252;

            gallons = minivan.fuelneeded(dist);
            System.out.println("Для преодоления " + dist + " миль, мини-фургону требуется " + gallons + " галлонов топлива");

            gallons = sportscar.fuelneeded(dist);
            System.out.println("Для преодоления " + dist + " миль, спортивному автомобилю требуется " + gallons + " галлонов топлива");

        }
    }