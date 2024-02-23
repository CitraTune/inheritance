package Aircraft;

public class VTOL extends Airplane{
    private boolean canHover;
    private double vtolSpeed; // Speed specific to VTOL
    private String vtolType; // Type of VTOL

    public VTOL(String brand, double speed, int passengers, double cargoWeight, double altitude, boolean canHover, double vtolSpeed, String vtolType) {
        super(brand, speed, passengers, cargoWeight, altitude);
        this.canHover = canHover;
        this.vtolSpeed = vtolSpeed;
        this.vtolType = vtolType;
    }

    // Override toString to include VTOL-specific information
    @Override
    public String toString() {
        String hoverInfo = canHover ? "Yes" : "No";
        return super.toString() +
                "Can Hover: \t\t" + hoverInfo + "\n" +
                "VTOL Speed: \t\t" + vtolSpeed + " mph\n" +
                "VTOL Type: \t\t" + vtolType + "\n";
    }
}
