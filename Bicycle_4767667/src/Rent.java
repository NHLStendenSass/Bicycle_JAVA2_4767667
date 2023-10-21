import java.util.HashMap;
import java.util.HashSet;

public class Rent
{
    private HashSet<Bicycle> bicycles;
    private boolean rent;

    public Rent()
    {
        this.bicycles = new HashSet<>();
    }

    public void addBike(Bicycle bicycle)
    {
        bicycles.add(bicycle);
    }

    //TODO: rent bike
    public Bicycle rentBike()
    {

    }

    //TODO: return bike where it outputs total amount customer has to pay.
}
