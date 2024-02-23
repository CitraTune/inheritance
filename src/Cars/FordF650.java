package Cars;

public class FordF650 extends Car{
    private boolean isHeavyDuty;
    private float cargoSize; // in cubic feet
    private String bedMaterial;

    public FordF650(String brand, double speed, int passengers, double cargoWeight, int numDoors, boolean isHeavyDuty, float cargoSize, String bedMaterial) {
        super(brand, speed, passengers, cargoWeight, numDoors);
        this.isHeavyDuty = isHeavyDuty;
        this.cargoSize = cargoSize;
        this.bedMaterial = bedMaterial;
    }

    // Override toString to include Ford F650-specific information
    @Override
    public String toString() {
        String heavyDutyInfo = isHeavyDuty ? "Yes" : "No";
        return super.toString() +
                "Heavy Duty: \t\t" + heavyDutyInfo + "\n" +
                "Cargo Size (cu ft): \t" + cargoSize + "\n" +
                "Bed Material: \t\t" + bedMaterial + "\n";
    }

}
