public interface Bicycle {
    double getDistance();
    double calculateRentalPrice(double time, double kilometer);

    void returnBicycle(double time, double kilometer);
}
