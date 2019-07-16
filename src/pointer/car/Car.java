package pointer.car;

public class Car {
    private CarModel model;
    private View view;

    public Car(CarModel model, View view) {
        this.model = model;
        this.view = view;
    }

    public void drive(int km) {
        if (km <= 0) {
            view.showDistanceError();
            return;
        }

        if (model.getFuel() == 0) {
            view.showEmptyTankError();
            return;
        }

        float distance = model.getDistance();

        if (km <= distance) {
            model.addTotalDistance(km);
            model.setFuel( model.getFuel() - model.getGasUsage() * km / 100 );

            view.showCurrentDrive(km,  model);
        } else {
            model.addTotalDistance(distance);
            model.setFuel(0); // all fuel are used.

            view.showCurrentDrive(distance,  model);
        }
    }

    public void reFuel(int fuelVolume) {
        model.setFuel(model.getFuel() + fuelVolume);

        if (model.getTank() >= model.getFuel()) {
            view.showLitters(model);
        }

        view.showLitters(model);
        model.setFuel(model.getTank());
    }

    public void distance() {
        view.showModel(model);
    }
}
