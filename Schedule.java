
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
    }
    
}
