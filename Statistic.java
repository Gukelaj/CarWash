import java.util.ArrayList;

public class Statistic {

    ArrayList<CarWash> carwashes = new ArrayList<CarWash>();
    
    public Statistic ()
    {
    
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