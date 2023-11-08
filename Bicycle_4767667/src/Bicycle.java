import java.util.HashSet;
import java.util.Objects;

/**
 * Represents a Bicycle, which is an abstract class.
 */
public abstract class Bicycle {
    protected double distance;
    protected boolean customerPaid;
    protected BicycleType type;
    protected GPSTracker gpsTracker;

    /**
     * Constructor for the Bicycle class.
     *
     * @param type The type of the bicycle.
     */
    public Bicycle(BicycleType type) {
        this.type = type;
        this.distance = 0;
        this.customerPaid = false;
        this.gpsTracker = new GPSTracker();
    }

    /**
     * Retrieves the total distance traveled by the bicycle.
     *
     * @return The total distance traveled by the bicycle.
     */
    public double getDistance() {
        return gpsTracker.getTotalDistance();
    }

    /**
     * Adds the given distance to the total distance traveled by the bicycle.
     *
     * @param distance The distance to be added.
     */
    public void addDistance(double distance) {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        gpsTracker.updateDistance(distance);
    }

    /**
     * Retrieves the type of the bicycle.
     *
     * @return The type of the bicycle.
     */
    public BicycleType getType() {
        return type;
    }

    /**
     * Calculates the total payment for the bicycle.
     *
     * @param distance The distance traveled with the bicycle.
     * @param hours    The duration for which the bicycle was used.
     * @return The total payment for the bicycle.
     */
    public abstract double calculateTotalPayment(double distance, double hours);

    /**
     * Checks if the customer has paid for the bicycle.
     *
     * @return The payment status of the bicycle.
     */
    public boolean hasCustomerPaid() {
        return customerPaid;
    }

    /**
     * Sets the payment status of the bicycle.
     *
     * @param paid The status of whether the customer has paid for the bicycle.
     */
    public void setCustomerPaid(boolean paid) {
        this.customerPaid = paid;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type=" + type +
                ", distance=" + gpsTracker.getTotalDistance() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return type == bicycle.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
