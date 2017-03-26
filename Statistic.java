import java.util.ArrayList;

public class Statistic {

    private String surName;
    private String lastName;

    ArrayList<CarWash> carwashes = new ArrayList<CarWash>();

    public Statistic (String surName, String lastName)
    {
        this.surName = surName;
        this.lastName = lastName;
    }
    
    public Statistic ()
    {
    
    }

    public String getSurName()
    { 
        return this.surName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void addCarwash(CarWash carwash)
    {
        carwashes.add(carwash);
    }

    public void print()
    {
        for(int i = 0; i < carwashes.size(); i++)
        {
            System.out.println(carwashes.get(i));
        }
    }
}