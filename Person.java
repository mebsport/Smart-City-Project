
/**
 * Person outline for the user of the program.
 *
 * Marcelus Brown
 * 12/15/21
 */
public class Person
{
    private String name;
    private int age;
    private int cash;
    private boolean student;
    public static int thingsPlanned = 0;
    Schedule plan;
    
    public Person (String n, int a, int c, boolean s)
    {
        name = n;
        age = a;
        cash = c;
        student = s;
    }
    public Person ()
    {
        name = "  ";
        age = 0;
        cash = 0;
        student = false;
    }
    
    public String getFirstName()
    {
        return name.substring(0, name.indexOf(" "));
    }
        public String getLastName()
    {
        return name.substring(name.indexOf(" ") +1);
    }
    public int getAge()
    {
        return age;
    }
    public int getBalance()
    {
        return cash;
    }
    public void newPlan()
    {
        thingsPlanned ++;
    }
    public int getNumThingsPlanned()
    {
        return thingsPlanned;
    }
    public void makeSchedule(int a)
    {
         plan = new Schedule(a);
    }
    public void addPlan(String activity)
    {
        plan.add(activity);
    }
    public void readSchedule()
    {
        plan.read();
    }
}
