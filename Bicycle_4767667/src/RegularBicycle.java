
class RegularBicycle extends Bicycle {
    public RegularBicycle(String type) {
        super(type);
    }
    // ... (rest of the implementation remains the same)

    @Override
    public double calculateTotalPayment(double distance, double hours) {
        return (distance * 0.20 + hours * 2) - 20;
    }

    @Override
    public boolean hasCustomerPaid() {
        return false; // Implement your own logic here
    }

    @Override
    public void setCustomerPaid(boolean paid) {
        // Implement your own logic here
    }
}
