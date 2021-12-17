
/**
 * Write a description of class Transport here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Transport
{
    private String vroomVroom;
    
    public Transport()
    {
        vroomVroom = " ";
    }
    
    public void selectTransportation()
    {
        System.out.println("What form of transport would you like to use for t his week?");
        System.out.println("1: Walk");
        System.out.println("2: Bike Rental");
        System.out.println("3: Bus");
        System.out.println("4: Taxi");
        System.out.println("5: Uber");
        Scanner tInput = new Scanner(System.in);
        int transportSelect = tInput.nextInt();
        if(transportSelect == 1)
        {
            vroomVroom = "Walk";
        }
        if(transportSelect == 2)
        {
            vroomVroom = "Bike Rental";
        }
        if(transportSelect == 3)
        {
            vroomVroom = "Bus";
        }
        if(transportSelect == 4)
        {
            vroomVroom = "Taxi";
        }
        if(transportSelect == 5)
        {
            vroomVroom = "Uber";
        }
    }
    public String getTransport()
    {
        return vroomVroom;
    }
}
