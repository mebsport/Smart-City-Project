
/**
 * runner for the program to go through and test everything
 *
 * Marcelus Brown
 * 12/15/21
 */
import java.util.*;
public class Runner
{
    public static void main( String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your first name?");
        String name = keyboard.next();
        System.out.println("What is your last name?");
        name += " " + keyboard.next();
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("How much money do you have in your bank accout?");
        int cash = keyboard.nextInt();
        System.out.println("Are you a student? (y or n)");
        boolean student;
        if(keyboard.next().equals("y"))
        {
            student = true;
        }
        else student = false;
        Person user = new Person(name, age, cash, student);
        System.out.print("Welcome " + user.getFirstName());
        System.out.println(" How many things would you like to do this week? (5-10)");
        int planNum = keyboard.nextInt();
        user.makeSchedule(planNum);
        CentralPark centralPark = new CentralPark();
        Restaurant restaurant = new Restaurant();
        StatueOfLiberty statueOfLiberty = new StatueOfLiberty();
        
        for(int i = 0; i <= planNum; i++)
        {
            System.out.println("Where would you like to start your vacation plan?");
            System.out.println("1: Central Park");
            System.out.println("2: Resturant");
            System.out.println("3: Eiffel Tower");
            System.out.println("Select an place by typing a number 1-3 and pressing enter");
            int selection = keyboard.nextInt();
            String activityPick;
            if(selection == 1)
            {
                activityPick = centralPark.run();
                user.addPlan(activityPick);
            }
            else if(selection == 2)
            {
                activityPick = restaurant.run();
                user.addPlan(activityPick);
            }
            else
            {
                activityPick = statueOfLiberty.run();
                user.addPlan(activityPick);
            }
        }
        user.readSchedule();
    }
}