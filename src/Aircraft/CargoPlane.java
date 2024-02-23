package Aircraft;

public class CargoPlane extends Airplane{
    private double cargoCapacity; // in cubic meters

    public CargoPlane(String brand, double speed, int passengers, double cargoWeight, double altitude, double cargoCapacity) {
        super(brand, speed, passengers, cargoWeight, altitude);
        this.cargoCapacity = cargoCapacity;
    }

    // Override toString to include cargo plane-specific information
    @Override
    public String toString() {
        return super.toString() + "Cargo Capacity: \t" + cargoCapacity + " cubic meters\n";
    }
}
