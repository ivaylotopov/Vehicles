package vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double total = (super.getFuelConsumption()+0.9)*distance;
        if (total <= super.getFuelQuantity()){
        super.setFuelQuantity(super.getFuelQuantity() - total);
            DecimalFormat decimalFormat = new DecimalFormat("###.#");
            System.out.printf("Car travelled %s km\n",decimalFormat.format(distance));
     } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {

        if (getFuelQuantity() + liters > getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
        }
        else {
            setFuelQuantity(getFuelQuantity() + liters);
        }
    }
}
