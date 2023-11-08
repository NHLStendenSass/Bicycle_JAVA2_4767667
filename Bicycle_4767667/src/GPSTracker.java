public class GPSTracker {
    private double totalDistance;

    public GPSTracker() {
        this.totalDistance = 0;
    }

    public void updateDistance(double distance) {
        this.totalDistance += distance;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
