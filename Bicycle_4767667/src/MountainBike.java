public class MountainBike implements Bicycle
{
    private static final double DEPOSIT = 20;
    private static final double PRICE_PER_KM = 0.25;
    private static final double PRICE_PER_HOUR = 2;
    private double distance;
    private String bikeId;

    public MountainBike(String bikeId) {
        this.bikeId = bikeId;
    }

    @Override
    public double getDistance() {
        return 0;
    }

    @Override
    public double calculateRentalPrice(double time, double kilometer) {
        return 0;
    }

    @Override
    public void returnBicycle(double time, double kilometer) {

    }
}
