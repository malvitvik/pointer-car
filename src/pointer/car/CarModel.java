package pointer.car;

public class CarModel {
    private String color;
    private String brand;
    private int tank;
    private float fuel;
    private float gasUsage;
    private float totalDistance;

    public CarModel(String brand, String color, int tank, float gasUsage) {
        this.brand = brand;
        this.color = color;
        this.tank = tank;
        this.gasUsage = gasUsage;
    }

    public CarModel(String brand, String color) {
        this(brand, color, 50, 8);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getTank() {
        return tank;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public float getGasUsage() {
        return gasUsage;
    }

    public float getTotalDistance() {
        return totalDistance;
    }

    public void addTotalDistance(float distance) {
        this.totalDistance += distance;
    }

    public float getDistance() {
        return fuel / gasUsage * 100;
    }

    @Override
    public String toString() {
        return String.format("\nCar brand: %1$s.\nCar color: %2$s.\nTank is %3$s.\nTotal distance: %4$s\nFuel left: %5$.2f", brand, color, tank, totalDistance, fuel);
    }
}
