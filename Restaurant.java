
/**
 * Write a description of class Restaurant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Restaurant
{
    int timesUsed;
    
    public Restaurant()
    {
        timesUsed = 0;
    }
    
    public String run()
    {
        Scanner rInput = new Scanner(System.in);
        System.out.println("Welcome to this generic resturant!");
        System.out.println("What would you like eat?");
        System.out.println("1: Breakfeast");
        System.out.println("2: Lunch");
        System.out.println("3: Dinner");
        System.out.println("Select an meal by typing a number 1-3 and pressing enter");
        int task = rInput.nextInt();
        Person rManager = new Person();
        if(task == 1)
        {
            rManager.thingsPlanned++;
            timesUsed++;
            return "Eat Breakfeast";
        }
        if(task == 2)
        {
            rManager.thingsPlanned++;
            timesUsed++;
            return "Eat Lunch";
        }
        else
        {
            rManager.thingsPlanned++;
            timesUsed++;
            return "Eat Dinner";
        }
    }
}
