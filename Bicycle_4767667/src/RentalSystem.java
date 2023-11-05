import java.util.HashSet;

interface RentalSystem {
    HashSet<Bicycle> availableBicycles();
    void rentBicycle(String startTime, Bicycle bicycle);
    void returnBicycle(String endTime, double kilometer, Bicycle bicycle);
    void checkCustomerPaid(Bicycle bicycle);
    void pay(Bicycle bicycle, double distance, double hours);
}
