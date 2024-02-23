package Spacecraft;

import Spacecraft.Spacecraft;

public class Satellite extends Spacecraft {
    private String purpose;
    private double orbitAltitude; // Orbit altitude in kilometers

    public Satellite(String brand, double speed, int passengers, double cargoWeight, String propulsionSystem, String purpose, double orbitAltitude) {
        super(brand, speed, passengers, cargoWeight, propulsionSystem);
        this.purpose = purpose;
        this.orbitAltitude = orbitAltitude;
    }

    // Override toString to include Satellite-specific information
    @Override
    public String toString() {
        return super.toString() +
                "Purpose: \t\t\t" + purpose + "\n" +
                "Orbit Altitude (km): \t" + orbitAltitude + "\n";
    }
}
