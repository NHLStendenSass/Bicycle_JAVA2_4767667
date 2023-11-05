import java.util.HashMap;
import java.util.HashSet;

class Rent implements RentalSystem
{
    private HashSet<Bicycle> bicycles;
    private double deposit;
    private double regularPrice;
    private double mountainPrice;
    private double electricalPrice;
    private double hourPrice;
    private boolean customerPaid;

    public Rent() {
        this.bicycles = new HashSet<>();
        this.deposit = 20;
        this.regularPrice = 0.20;
        this.mountainPrice = 0.25;
        this.electricalPrice = 0.50;
        this.hourPrice = 2;
        this.customerPaid = false;
    }

    public HashSet<Bicycle> availableBicycles() {
        return bicycles;
    }

    public void rentBicycle(String startTime, Bicycle bicycle) {
        if (bicycles.contains(bicycle)) {
            System.out.println("Bicycle is available for rent");
            // Add rental logic here
        } else {
            System.out.println("Bicycle is not available for rent");
        }
    }

    public void returnBicycle(String endTime, double kilometer, Bicycle bicycle) {
        if (bicycles.contains(bicycle)) {
            System.out.println("Bicycle is returned");
            // Add return logic here
        } else {
            System.out.println("Invalid bicycle return");
        }
    }

    @Override
    public void checkCustomerPaid(Bicycle bicycle) {
        System.out.println("Checking if the customer has paid for " + bicycle.getType());
        if (bicycle.hasCustomerPaid()) {
            System.out.println("Customer has paid.");
        } else {
            System.out.println("Customer has not paid yet.");
        }
    }


    public void checkCustomerPaid() {
        // Add logic to check if the customer has paid after returning the bicycle
        if (customerPaid) {
            System.out.println("Customer has paid.");
        } else {
            System.out.println("Customer has not paid yet.");
        }
    }

    public void pay(Bicycle bicycle, double distance, double hours) {
        // Add payment logic here
        double totalAmount = (distance * getBicyclePrice() + hours * hourPrice) - deposit;
        if (totalAmount > 0) {
            System.out.println("The total amount to be paid is: " + totalAmount);
            customerPaid = true;
        } else {
            System.out.println("No additional payment needed. Deposit covers the costs.");
            customerPaid = true;
        }
    }

    private double getBicyclePrice() {
        if (regularPrice > mountainPrice && regularPrice > electricalPrice) {
            return regularPrice;
        } else if (mountainPrice > regularPrice && mountainPrice > electricalPrice) {
            return mountainPrice;
        } else {
            return electricalPrice;
        }
    }
}
