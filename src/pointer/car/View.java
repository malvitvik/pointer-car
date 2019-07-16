package pointer.car;

public class View {


    public void showModel(CarModel model) {
        System.out.println(model);
    }

    public void showDistanceError() {
        System.out.println("You have set negative or zero distance.");
    }

    public void showEmptyTankError() {
        System.out.println("The gas is run out. Please re-fuel the car.");
    }

    public void showCurrentDrive(float km, CarModel model) {
        if (km <= model.getTotalDistance()) {
            System.out.println(String.format("\nCar is driven during %1$s. Total distance is: %2$s km.", km, model.getTotalDistance()));
        } else {
            System.out.println(String.format("\nYou cannot drive full distance. Car is driven during %1$s. Total distance is: %2$s km.", km, model.getTotalDistance()));
        }
    }

    public void showLitters(CarModel model) {
        if (model.getTank() < model.getFuel()) {
            System.out.println(String.format("The tank is full. Not all fuel are needed. Fuel left: %.2f", (model.getFuel() - model.getTank())));
        } else {
            System.out.println(String.format("The tank has %s litters.", model.getFuel()));
        }
    }
}
