package Spacecraft;

public class Spacecraft extends Vehicle.Vehicle{
    private String propulsionSystem;

    public Spacecraft(String brand, double speed, int passengers, double cargoWeight, String propulsionSystem) {
        super(brand, speed, passengers, cargoWeight);
        this.propulsionSystem = propulsionSystem;
    }

    // Override toString to include Spacecraft-specific information
    @Override
    public String toString() {
        return super.toString() +
                "Propulsion System: \t" + propulsionSystem + "\n";
    }
}
