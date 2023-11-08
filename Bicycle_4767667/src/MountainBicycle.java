/**
 * Represents a mountain bicycle, a type of Bicycle.
 */
class MountainBicycle extends Bicycle {

    /**
     * Constructor for the MountainBicycle class.
     *
     * @param type The type of the mountain bicycle.
     */
    public MountainBicycle(BicycleType type) {
        super(type);
    }

    /**
     * Calculates the total payment for the mountain bicycle.
     *
     * @param distance The distance traveled with the mountain bicycle.
     * @param hours    The duration for which the mountain bicycle was used.
     * @return The total payment for the mountain bicycle.
     */
    @Override
    public double calculateTotalPayment(double distance, double hours) {
        return (distance * 0.25 + hours * 2) - 20;
    }

    /**
     * Checks if the customer has paid for the mountain bicycle.
     *
     * @return The payment status of the mountain bicycle.
     */
    @Override
    public boolean hasCustomerPaid() {
        return false; // Implement your own logic here
    }

    /**
     * Sets the payment status of the mountain bicycle.
     *
     * @param paid The status of whether the customer has paid for the mountain bicycle.
     */
    @Override
    public void setCustomerPaid(boolean paid) {
        if (paid) {
            this.customerPaid = true;
        } else {
            this.customerPaid = false;
        }
    }
}
