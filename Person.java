
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
    private int thingsPlanned;
    
    public Person (String n, int a, int c, boolean s)
    {
        name = n;
        age = a;
        cash = c;
        student = s;
        thingsPlanned = 0;
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
}
