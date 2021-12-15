
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
        System.out.println("How many things would you like to do this week? (5-10)");
        int planNum = keyboard.nextInt();
        Schedule plan = new Schedule(planNum);
        System.out.println("Where would you like to start your vacation plan?");
    }
}