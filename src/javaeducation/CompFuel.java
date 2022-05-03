package javaeducation;

class Vehicle6 {
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в мил€х на галлон

    // ќпределение дальности поездки транспортного средства
    int range () {
        return mpg * fuelcap;
    }
    // –асчет количества топлива, необходимого
    // транспортному средству дл€ преодолени€ зданного рассто€ни€
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle6 minivan = new Vehicle6();
        Vehicle6 sportscar = new Vehicle6();
        double gallons;
        int dist =  252;

        // ѕрисваивание значений пол€м объекта sportscar
        minivan.passengers = 2;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // ѕрисваивание значений пол€м объекта sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("ƒл€ преодолени€ " + dist + " миль мини-фургону требуетс€ " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("ƒл€ предолени€ " + dist + " миль спортивному автомобилю требуетс€ " + gallons + " галлонов топлива");
    }
}
