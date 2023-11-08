import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRentalSystem {
    Rent rent;

    @Before
    public void setUp() {
        rent = new Rent();
        rent.addBicycle(new RegularBicycle(BicycleType.REGULAR));
        rent.addBicycle(new ElectricalBicycle(BicycleType.ELECTRICAL));
    }

    @Test
    public void testRentBicycle() {
        assertEquals("Bicycle is available for rent", rent.rentBicycle("10:00", new RegularBicycle(BicycleType.REGULAR)));
    }

    @Test
    public void testReturnBicycle() {
        rent.rentBicycle("10:00", new RegularBicycle(BicycleType.REGULAR));
        assertEquals("Bicycle is returned", rent.returnBicycle("12:00", 10.0, new RegularBicycle(BicycleType.REGULAR)));
    }

    @Test
    public void testCheckCustomerPaid() {
        rent.rentBicycle("10:00", new RegularBicycle(BicycleType.REGULAR));
        assertEquals("Checking if the customer has paid for REGULAR\nCustomer has not paid yet.", rent.checkCustomerPaid(new RegularBicycle(BicycleType.REGULAR)));
    }

    @Test
    public void testPay() {
        rent.rentBicycle("10:00", new RegularBicycle(BicycleType.REGULAR));
        assertEquals("No additional payment needed. Deposit covers the costs.", rent.pay(new RegularBicycle(BicycleType.REGULAR), 15.0, 2.5));
    }

    @Test
    public void testAvailableBicycles() {
        assertNotNull(rent.availableBicycles());
        assertEquals(2, rent.availableBicycles().size());
        assertTrue(rent.availableBicycles().contains(new RegularBicycle(BicycleType.REGULAR)));
        assertTrue(rent.availableBicycles().contains(new ElectricalBicycle(BicycleType.ELECTRICAL)));
    }

    @Test
    public void testRentReturnAndPayElectricalBicycle() {
        assertEquals("Bicycle is available for rent", rent.rentBicycle("10:00", new ElectricalBicycle(BicycleType.ELECTRICAL)));
        assertEquals("Bicycle is returned", rent.returnBicycle("12:00", 10.0, new ElectricalBicycle(BicycleType.ELECTRICAL)));
        assertEquals("Checking if the customer has paid for ELECTRICAL\nCustomer has not paid yet.", rent.checkCustomerPaid(new ElectricalBicycle(BicycleType.ELECTRICAL)));
        assertEquals("No additional payment needed. Deposit covers the costs.", rent.pay(new ElectricalBicycle(BicycleType.ELECTRICAL), 15.0, 2.5));
        assertNotNull(rent.availableBicycles());
        assertEquals(2, rent.availableBicycles().size());
        assertTrue(rent.availableBicycles().contains(new RegularBicycle(BicycleType.REGULAR)));
        assertTrue(rent.availableBicycles().contains(new ElectricalBicycle(BicycleType.ELECTRICAL)));
    }
}
