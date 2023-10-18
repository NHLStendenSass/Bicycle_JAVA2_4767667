public class RegularBike implements Bicycle
{
    private static final double DEPOSIT = 20;
    private static final double PRICE_PER_KM = 0.2;
    private static final double PRICE_PER_HOUR = 2;
    private double distance;
    private String bikeId;

    public RegularBike(String bikeId) {
        this.bikeId = bikeId;
    }

    @Override
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getBikeId() {
        return bikeId;
    }

    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }

    @Override
    public double calculateRentalPrice(double time, double kilometer)
    {
        return (time * PRICE_PER_HOUR) + (kilometer * PRICE_PER_KM) + DEPOSIT;
    }

    @Override
    public void returnBicycle(double time, double kilometer)
    {
        distance += kilometer;
    }
}
