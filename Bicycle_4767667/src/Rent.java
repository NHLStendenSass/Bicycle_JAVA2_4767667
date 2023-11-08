import java.util.HashSet;

/**
 * Class representing the rental system.
 */
class Rent implements RentalSystem {
    private HashSet<Bicycle> bicycles;
    private double deposit;
    private double regularPrice;
    private double mountainPrice;
    private double electricalPrice;
    private double hourPrice;
    private boolean customerPaid;

    /**
     * Constructor for the Rent class.
     */
    public Rent() {
        this.bicycles = new HashSet<>();
        this.deposit = 20;
        this.regularPrice = 0.20;
        this.mountainPrice = 0.25;
        this.electricalPrice = 0.50;
        this.hourPrice = 2;
        this.customerPaid = false;
    }

    /**
     * Get the set of available bicycles.
     *
     * @return The set of available bicycles.
     */
    public HashSet<Bicycle> availableBicycles() {
        return bicycles;
    }

    /**
     * Add a bicycle to the rental system.
     *
     * @param bicycle The bicycle to be added.
     */
    public void addBicycle(Bicycle bicycle) {
        bicycles.add(bicycle);
    }

    /**
     * Rent a bicycle.
     *
     * @param startTime The start time of the rental.
     * @param bicycle   The bicycle to be rented.
     * @return The rental status message.
     */
    public String rentBicycle(String startTime, Bicycle bicycle) {
        if (bicycles.contains(bicycle)) {
            bicycle.setCustomerPaid(false); // Reset customerPaid status
            return "Bicycle is available for rent";
        } else {
            return "Bicycle is not available for rent";
        }
    }

    /**
     * Return a rented bicycle.
     *
     * @param endTime    The end time of the rental.
     * @param kilometer  The distance traveled during the rental period.
     * @param bicycle    The bicycle to be returned.
     * @return The return status message.
     */
    public String returnBicycle(String endTime, double kilometer, Bicycle bicycle) {
        if (bicycles.contains(bicycle)) {
            bicycle.setCustomerPaid(true); // Set customerPaid to true upon return
            double totalDistance = bicycle.getDistance() + kilometer; // Calculate total distance
            bicycle.addDistance(kilometer); // Add the distance traveled
            return "Bicycle is returned. Total distance for this ride: " + totalDistance + " km.";
        } else {
            return "Invalid bicycle return";
        }
    }

    /**
     * Check if the customer has paid for a bicycle.
     *
     * @param bicycle The bicycle to be checked for payment status.
     * @return The payment status message.
     */
    @Override
    public String checkCustomerPaid(Bicycle bicycle) {
        return "Checking if the customer has paid for " + bicycle.getType() +
                "\n" + (bicycle.hasCustomerPaid() ? "Customer has paid." : "Customer has not paid yet.");
    }

    /**
     * Check if the customer has paid for any bicycle.
     *
     * @return The payment status message.
     */
    public String checkCustomerPaid() {
        // Add logic to check if the customer has paid after returning the bicycle
        return customerPaid ? "Customer has paid." : "Customer has not paid yet.";
    }

    /**
     * Make a payment for a rented bicycle.
     *
     * @param bicycle  The bicycle for which the payment is being made.
     * @param distance The distance traveled with the bicycle.
     * @param hours    The duration for which the bicycle was rented.
     * @return The payment status message.
     */
    public String pay(Bicycle bicycle, double distance, double hours) {
        // Add payment logic here
        double totalAmount = (distance * getBicyclePrice(bicycle.getType()) + hours * hourPrice) - deposit;
        if (totalAmount > 0) {
            customerPaid = true;
            return "The total amount to be paid is: " + totalAmount;
        } else {
            customerPaid = true;
            return "No additional payment needed. Deposit covers the costs.";
        }
    }

    private double getBicyclePrice(BicycleType type) {
        if (type == BicycleType.REGULAR) {
            return regularPrice;
        } else if (type == BicycleType.MOUNTAIN) {
            return mountainPrice;
        } else {
            return electricalPrice;
        }
    }

    public String displayTotalDistance() {
        for (Bicycle bicycle : bicycles) {
            return "Bicycle type: " + bicycle.getType() + " Total Distance: " + bicycle.getDistance() + " km";
        }
        return null;
    }

    /**
     * Returns a string representation of the Rent object.
     *
     * @return A string representation of the Rent object.
     */
    @Override
    public String toString() {
        return "Rent{" +
                "bicycles=" + bicycles +
                ", deposit=" + deposit +
                ", regularPrice=" + regularPrice +
                ", mountainPrice=" + mountainPrice +
                ", electricalPrice=" + electricalPrice +
                ", hourPrice=" + hourPrice +
                ", customerPaid=" + customerPaid +
                '}';
    }
}
