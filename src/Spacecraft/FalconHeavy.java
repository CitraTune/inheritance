package Spacecraft;

public class FalconHeavy extends Spacecraft {
    private int payloadCapacity; // Payload capacity in kg
    private int numberOfStages;

    public FalconHeavy(String brand, double speed, int passengers, double cargoWeight, String propulsionSystem, int payloadCapacity, int numberOfStages) {
        super(brand, speed, passengers, cargoWeight, propulsionSystem);
        this.payloadCapacity = payloadCapacity;
        this.numberOfStages = numberOfStages;
    }

    // Override toString to include FalconHeavy-specific information
    @Override
    public String toString() {
        return super.toString() +
                "Payload Capacity: \t" + payloadCapacity + " kg\n" +
                "Number of Stages: \t" + numberOfStages + "\n";
    }
}
