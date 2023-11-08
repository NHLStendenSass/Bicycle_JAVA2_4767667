import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Rent rent = new Rent();

        // Creating bicycle instances
        RegularBicycle regularBike = new RegularBicycle(BicycleType.REGULAR);
        ElectricalBicycle electricalBike = new ElectricalBicycle(BicycleType.ELECTRICAL);

        // Adding bicycles to the Rent object
        rent.addBicycle(regularBike);
        rent.addBicycle(electricalBike);

        // Display available bicycles
        System.out.println("Available bicycles:");
        for (Bicycle bicycle : rent.availableBicycles()) {
            System.out.println(bicycle.getType());
        }

        System.out.println("----------------------------");

        // Rent a regular bicycle
        System.out.println(rent.rentBicycle("10:00", regularBike));

        System.out.println("----------------------------");

        // Return a regular bicycle
        System.out.println(rent.returnBicycle("12:00", 10.0, regularBike));

        System.out.println("----------------------------");

        // Check if the customer has paid for the regular bicycle
        System.out.println(rent.checkCustomerPaid(regularBike));

        System.out.println("----------------------------");

        // Make a payment for the regular bicycle
        System.out.println(rent.pay(regularBike, 15.0, 2.5));

        System.out.println("----------------------------");

        // Display available bicycles after the rental of the regular bicycle
        System.out.println("Available bicycles after rental:");
        for (Bicycle bicycle : rent.availableBicycles()) {
            System.out.println(bicycle.getType());
        }

        System.out.println("----------------------------");

        // Rent an electrical bicycle
        System.out.println(rent.rentBicycle("10:00", electricalBike));

        System.out.println("----------------------------");

        // Return an electrical bicycle
        System.out.println(rent.returnBicycle("12:00", 10.0, electricalBike));

        System.out.println("----------------------------");

        // Check if the customer has paid for the electrical bicycle
        System.out.println(rent.checkCustomerPaid(electricalBike));

        System.out.println("----------------------------");

        // Make a payment for the electrical bicycle
        System.out.println(rent.pay(electricalBike, 15.0, 2.5));

        System.out.println("----------------------------");

        // Display available bicycles after the rental of the electrical bicycle
        System.out.println("Available bicycles after rental:");
        for (Bicycle bicycle : rent.availableBicycles()) {
            System.out.println(bicycle.getType());
        }

        System.out.println("----------------------------");
        System.out.println("Total distances of following bicycles:");
        System.out.println(rent.displayTotalDistance());
    }
}