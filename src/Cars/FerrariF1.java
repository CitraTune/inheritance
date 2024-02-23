package Cars;

public class FerrariF1 extends Car{
    private boolean isFormula1;
    private float downforce;

    public FerrariF1(String brand, double speed, int passengers, double cargoWeight, int numDoors, boolean isFormula1, float downforce) {
        super(brand, speed, passengers, cargoWeight, numDoors);
        this.isFormula1 = isFormula1;
        this.downforce = downforce;
    }

    // Override toString to include Ferrari F1-specific information
    @Override
    public String toString() {
        String formula1Info = isFormula1 ? "Yes" : "No";
        return super.toString() + "Formula 1: \t\t" + formula1Info + "\n";
    }
}
