package Boats;

public class JetSki extends Boat{
    private int horsepower;
    private boolean hasReverseGear;

    public JetSki(String brand, double speed, int passengers, double cargoWeight, String boatType, int horsepower, boolean hasReverseGear) {
        super(brand, speed, passengers, cargoWeight, boatType);
        this.horsepower = horsepower;
        this.hasReverseGear = hasReverseGear;
    }

    // Override toString to include JetSki-specific information
    @Override
    public String toString() {
        return super.toString() +
                "Horsepower: \t\t" + horsepower + " hp\n" +
                "Reverse Gear: \t\t" + (hasReverseGear ? "Yes" : "No") + "\n";
    }
}
