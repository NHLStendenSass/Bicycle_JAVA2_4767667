/**
 * Represents a regular bicycle, a type of Bicycle.
 */
class RegularBicycle extends Bicycle {
    /**
     * Constructor for the RegularBicycle class.
     *
     * @param type The type of the regular bicycle.
     */
    public RegularBicycle(BicycleType type) {
        super(type);
    }

    /**
     * Calculates the total payment for the regular bicycle.
     *
     * @param distance The distance traveled with the regular bicycle.
     * @param hours    The duration for which the regular bicycle was used.
     * @return The total payment for the regular bicycle.
     */
    @Override
    public double calculateTotalPayment(double distance, double hours) {
        return (distance * 0.20 + hours * 2) - 20;
    }

    /**
     * Checks if the customer has paid for the regular bicycle.
     *
     * @return The payment status of the regular bicycle.
     */
    @Override
    public boolean hasCustomerPaid() {
        return false; // Implement your own logic here
    }

    /**
     * Sets the payment status of the regular bicycle.
     *
     * @param paid The status of whether the customer has paid for the regular bicycle.
     */
    public void setCustomerPaid(boolean paid) {
        // Implement specific logic for setting customerPaid for RegularBicycle
        if (paid) {
            this.customerPaid = true;
        } else {
            this.customerPaid = false;
        }
    }
}
