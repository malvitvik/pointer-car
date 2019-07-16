package pointer.car;

public class Main {

    public static void main(String[] args) {
        CarModel carModel = new CarModel("BMW","black",60,8.1f);
        Car bmw = new Car(carModel, new View());
        bmw.reFuel(60);
        bmw.drive(700);
        bmw.reFuel(60);
        bmw.drive(650);
        bmw.distance();
    }
}
