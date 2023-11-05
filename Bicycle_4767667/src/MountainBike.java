class MountainBike extends Bicycle {

    public MountainBike(String type) {
        super(type);
    }

    @Override
    public double calculateTotalPayment(double distance, double hours) {
        return (distance * 0.25 + hours * 2) - 20;
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
