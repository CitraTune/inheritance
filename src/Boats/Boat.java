package Boats;

import Vehicle.Vehicle;

public class Boat extends Vehicle {
    private String boatType;

    public Boat(String brand, double speed, int passengers, double cargoWeight, String boatType) {
        super(brand, speed, passengers, cargoWeight);
        this.boatType = boatType;
    }

    // Override toString to include boat-specific information
    @Override
    public String toString() {
        return super.toString() + "Boat Type: \t\t" + boatType + "\n";
    }
}
