package Aircraft;
import Vehicle.Vehicle;

public class Airplane extends Vehicle {
    private double altitude;

    public Airplane(String brand, double speed, int passengers, double cargoWeight, double altitude) {
        super(brand, speed, passengers, cargoWeight);
        this.altitude = altitude;
    }

    // Override toString to include airplane-specific information
    @Override
    public String toString() {
        return super.toString() + "Altitude: \t\t" + altitude + " feet\n";
    }
}
