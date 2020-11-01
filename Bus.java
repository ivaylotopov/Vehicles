package vehicles;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double distance) {
        double total = (super.getFuelConsumption()+1.4)*distance;
        if (total <= super.getFuelQuantity()){
            super.setFuelQuantity(super.getFuelQuantity() - total);
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            System.out.printf("Bus travelled %s km\n",decimalFormat.format(distance));
        } else {
            System.out.println("Bus needs refueling");
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
    public void empty(double distance){
        double total = (super.getFuelConsumption())*distance;
        if (total <= super.getFuelQuantity()){
            super.setFuelQuantity(super.getFuelQuantity() - total);
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            System.out.printf("Bus travelled %s km\n",decimalFormat.format(distance));
        } else {
            System.out.println("Bus needs refueling");
        }
    }
}
