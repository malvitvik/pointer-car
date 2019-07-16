package pointer.car;

public class Car {
    private String color;
    private String brand;
    private int tank;
    private float fuel;
    private float gasUsage;
    private int totalDistance;

    public Car(String brand, String color, int tank, float gasUsage) {
        this.brand = brand;
        this.color = color;
        this.tank = tank;
        this.gasUsage = gasUsage;
    }

    public Car(String brand, String color) {
        this(brand, color, 50, 8);
    }

    public void drive(int km) {
        if (km <= 0) {
            System.out.println("You have set negative or zero distance.");
            return;
        }

        if (fuel == 0) {
            System.out.println("The gas is run out. Please re-fuel the car.");
            return;
        }

        float distance = fuel / gasUsage * 100;

        if (km <= distance) {
            totalDistance +=km;
            fuel -= gasUsage * km / 100;
            System.out.println(String.format("\nCar is driven during %1$s. Total distance is: %2$s km.", km, totalDistance));
        } else {
            totalDistance += distance;
            fuel = 0; // all fuel are used.
            System.out.println(String.format("\nYou cannot drive full distance. Car is driven during %1$s. Total distance is: %2$s km.", distance, totalDistance));
        }
    }

    public void reFuel(int fuelVolume) {
        fuel += fuelVolume;

        if (tank < fuel) {
            System.out.println(String.format("The tank is full. Not all fuel are needed. Fuel left: %.2f", (fuel - tank)));
            fuel = tank;
        } else {
            System.out.println(String.format("The tank has %s litters.", fuel));
        }
    }

    public void distance() {
        System.out.println(String.format("\nCar brand: %1$s.\nCar color: %2$s.\nTank is %3$s.\nTotal distance: %4$s\nFuel left: %5$.2f", brand, color, tank, totalDistance, fuel));
    }
}
