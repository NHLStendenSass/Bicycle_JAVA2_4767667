/**
 * Represents an electrical bicycle, a type of Bicycle.
 */
class ElectricalBicycle extends Bicycle {

    /**
     * Constructor for the ElectricalBicycle class.
     *
     * @param type The type of the electrical bicycle.
     */
    public ElectricalBicycle(BicycleType type) {
        super(type);
    }

    /**
     * Calculates the total payment for the electrical bicycle.
     *
     * @param distance The distance traveled with the electrical bicycle.
     * @param hours    The duration for which the electrical bicycle was used.
     * @return The total payment for the electrical bicycle.
     */
    @Override
    public double calculateTotalPayment(double distance, double hours) {
        return (distance * 0.50 + hours * 2) - 20;
    }

    /**
     * Checks if the customer has paid for the electrical bicycle.
     *
     * @return The payment status of the electrical bicycle.
     */
    @Override
    public boolean hasCustomerPaid() {
        return false; // Implement your own logic here
    }

    /**
     * Sets the payment status of the electrical bicycle.
     *
     * @param paid The status of whether the customer has paid for the electrical bicycle.
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
