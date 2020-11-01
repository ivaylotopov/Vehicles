package vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double total = (super.getFuelConsumption()+1.6)*distance;
        if (total <= super.getFuelQuantity()){
            super.setFuelQuantity(super.getFuelQuantity() - total);
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            System.out.printf("Truck travelled %s km\n",decimalFormat.format(distance));
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {

        if (getFuelQuantity() + liters > getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
        }
        else {
            setFuelQuantity(getFuelQuantity() + liters * 0.95);
        }
    }
}
