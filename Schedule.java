
/**
 * Write a description of class Schedule here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Schedule
{
    private String[]schedule;
    private int numPlans;
    private int current;
    
    public Schedule(int a)
    {
        numPlans = a;
        if(numPlans > 10)
        {
            numPlans = 10;
        }
        if(numPlans < 5)
        {
            numPlans = 5;
        }
        schedule = new String[numPlans];
        current = 0;
    }
    
    public void add(String plan)
    {
        if(current < numPlans)
        {
            schedule[current] = plan;
            current ++;
        }
    }
    public void read()
    {
        System.out.println("Here is your schedule for the week");
        System.out.println();
        for(int i = 0; i < numPlans; i++)
        {
            System.out.println(schedule[i]);
        }
    }
}
