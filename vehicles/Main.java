package vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cars = input.nextLine().split(" ");
        String[] trucks = input.nextLine().split(" ");
        String[] buses = input.nextLine().split(" ");
        Car car = new Car(Double.parseDouble(cars[1]), Double.parseDouble(cars[2]), Integer.parseInt(cars[3]));
        Truck truck = new Truck(Double.parseDouble(trucks[1]), Double.parseDouble(trucks[2]), Integer.parseInt(trucks[3]));
        Bus bus = new Bus(Double.parseDouble(buses[1]), Double.parseDouble(buses[2]), Integer.parseInt(buses[3]));
        int number = Integer.parseInt(input.nextLine());
        for (int i = 0; i < number; i++) {
            String[] cmd = input.nextLine().split(" ");
            if (cmd[0].equals("Drive") && cmd[1].equals("Car")) {
                car.drive(Double.parseDouble(cmd[2]));
            } else if (cmd[0].equals("Drive") && cmd[1].equals("Truck")) {
                truck.drive(Double.parseDouble(cmd[2]));
            } else if (cmd[0].equals("Refuel") && cmd[1].equals("Car")) {
                if (Double.parseDouble(cmd[2]) <= 0){
                    System.out.println("Fuel must be a positive number");
                } else
                car.refuel(Double.parseDouble(cmd[2]));
            } else if (cmd[0].equals("Refuel") && cmd[1].equals("Truck")) {
                if (Double.parseDouble(cmd[2]) <= 0){
                    System.out.println("Fuel must be a positive number");
                } else
                truck.refuel(Double.parseDouble(cmd[2]));
            } else if (cmd[0].equals("DriveEmpty") && cmd[1].equals("Bus")) {
                bus.empty(Double.parseDouble(cmd[2]));
            } else if (cmd[0].equals("Drive") && cmd[1].equals("Bus")) {
                bus.drive(Double.parseDouble(cmd[2]));
            } else if (cmd[0].equals("Refuel") && cmd[1].equals("Bus")) {
                if (Double.parseDouble(cmd[2]) <= 0){
                    System.out.println("Fuel must be a positive number");
                } else
                bus.refuel(Double.parseDouble(cmd[2]));
            }
        }
        System.out.printf("Car: %.2f\n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f\n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());
    }
}
