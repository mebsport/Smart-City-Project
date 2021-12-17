
/**
 * Write a description of class StatueOfLiberty here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class StatueOfLiberty
{
    int timesUsed;
    
    public StatueOfLiberty()
    {
        timesUsed = 0;
    }
    
    public String run()
    {
        Scanner slInput = new Scanner(System.in);
        System.out.println("Welcome to the Statue Of Liberty Tour Center!");
        System.out.println("What type of tour would you like?");
        System.out.println("1: Boat Tour");
        System.out.println("2: Land Tour");
        System.out.println("3: Deluxe Tour (Boat & Land)");
        System.out.println("Select a tour by typing a number 1-3 and pressing enter");
        int task = slInput.nextInt();
        Person slManager = new Person();
        if(task == 1)
        {
            slManager.thingsPlanned++;
            timesUsed++;
            return "Statue Of Liberty Boat Tour";
        }
        if(task == 2)
        {
            slManager.thingsPlanned++;
            timesUsed++;
            return "Statue Of Liberty Land Tour";
        }
        else
        {
            slManager.thingsPlanned++;
            timesUsed++;
            return "Statue Of Liberty Deluxe Tour";
        }
    }
}
