package Boats;

public class Yacht extends Boat{
    private int numberOfCabins;

    public Yacht(String brand, double speed, int passengers, double cargoWeight, String boatType, int numberOfCabins) {
        super(brand, speed, passengers, cargoWeight, boatType);
        this.numberOfCabins = numberOfCabins;
    }

    // Override toString to include yacht-specific information
    @Override
    public String toString() {
        return super.toString() + "Number of Cabins: \t" + numberOfCabins + "\n";
    }
}
