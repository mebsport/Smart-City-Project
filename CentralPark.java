
/**
 * Write a description of class CentralPark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class CentralPark
{
    int timesUsed;
    
    public CentralPark()
    {
        timesUsed = 0;
    }
    
    public String run()
    {
        Scanner cpInput = new Scanner(System.in);
        System.out.println("Welcome to Central Park!");
        System.out.println("What would you like to do on your trip to central park?");
        System.out.println("1: Go For A Run");
        System.out.println("2: Go For A Walk");
        System.out.println("3: Have A Picnic");
        System.out.println("4: Walk Your Dog");
        System.out.println("5: Buy A Hot Dog");
        System.out.println("Select an activity by typing a number 1-5 and pressing enter");
        int task = cpInput.nextInt();
        Person cpManager = new Person();
        if(task == 1)
        {
            goForARun(cpManager);
            return "Go For A Run";
        }
        if(task == 2)
        {
            goForAWalk(cpManager);
            return "Go For A Walk";
        }
        if(task == 3)
        {
            haveAPicnic(cpManager);
            return "Have A Picnic";
        }
        if(task == 4)
        {
            walkYourDog(cpManager);
            return "Walk Your Dog";
        }
        else
        {
            buyAHotdog(cpManager);
            return "Buy A Hotdog";
        }
    }
    
    public void goForARun(Person a)
    {
        a.thingsPlanned++;
        timesUsed++;
    }
    public void goForAWalk(Person a)
    {
        a.thingsPlanned++;
        timesUsed++;
    }
    public void haveAPicnic(Person a)
    {
        a.thingsPlanned++;
        timesUsed++;
    }
    public void walkYourDog(Person a)
    {
        a.thingsPlanned++;
        timesUsed++;
    }
    public void buyAHotdog(Person a)
    {
        a.thingsPlanned++;
        timesUsed++;
    }
}
