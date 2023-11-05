import java.util.HashSet;
public abstract class Bicycle {
    protected String type;
    protected double distance;
    protected boolean customerPaid;

    public Bicycle(String type) {
        this.type = type;
        this.distance = 0;
        this.customerPaid = false;
    }

    public void addDistance(double distance) {
        this.distance += distance;
    }

    public String getType() {
        return type;
    }

    public double getDistance() {
        return distance;
    }

    public abstract double calculateTotalPayment(double distance, double hours);

    public boolean hasCustomerPaid() {
        return customerPaid;
    }

    public void setCustomerPaid(boolean paid) {
        this.customerPaid = paid;
    }
}
