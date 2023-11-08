import java.util.HashSet;

interface RentalSystem {
    HashSet<Bicycle> availableBicycles();
    String rentBicycle(String startTime, Bicycle bicycle);
    String returnBicycle(String endTime, double kilometer, Bicycle bicycle);
    String checkCustomerPaid(Bicycle bicycle);
    String checkCustomerPaid();
    String pay(Bicycle bicycle, double distance, double hours);
}
