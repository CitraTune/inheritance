import Boats.*;
import Vehicle.*;
import Aircraft.*;
import Cars.*;
import Spacecraft.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 4, 1500, 4);
        System.out.println("Car Information:");
        System.out.println(car);

        // Creating a Boat object
        Boat boat = new Boat("Sea Ray", 40, 6, 2000, "Yacht");
        System.out.println("\nBoat Information:");
        System.out.println(boat);

        // Creating an Airplane object
        Airplane airplane = new Airplane("Boeing", 500, 200, 50000, 40000);
        System.out.println("\nAirplane Information:");
        System.out.println(airplane);

        // Creating a FordF650 object
        FordF650 fordF650 = new FordF650("Ford", 80, 3, 3000, 2, true, 1000, "Steel");
        System.out.println("\nFord F650 Information:");
        System.out.println(fordF650);

        // Creating a FerrariF1 object
        FerrariF1 ferrariF1 = new FerrariF1("Ferrari", 220, 1, 600, 2, true, 200);
        System.out.println("\nFerrari F1 Information:");
        System.out.println(ferrariF1);

        // Creating a JetSki object
        JetSki jetSki = new JetSki("Sea-Doo", 60, 2, 200, "Personal Watercraft", 150, true);
        System.out.println("\nJet Ski Information:");
        System.out.println(jetSki);

        // Creating a Spacecraft object
        Spacecraft spacecraft = new Spacecraft("SpaceX", 25000, 6, 5000, "Ion Thrusters");
        System.out.println("\nSpacecraft Information:");
        System.out.println(spacecraft);

        // Creating a FalconHeavy object
        FalconHeavy falconHeavy = new FalconHeavy("SpaceX", 30000, 0, 0, "Liquid Oxygen and RP-1", 60000, 2);
        System.out.println("\nFalcon Heavy Information:");
        System.out.println(falconHeavy);

        // Creating a Satellite object
        Satellite satellite = new Satellite("NASA", 25000, 0, 0, "Solar Electric Propulsion", "Earth Observation", 600);
        System.out.println("\nSatellite Information:");
        System.out.println(satellite);

    }
}