public class CarWash 
{
    private String name;
    private double price;

    public CarWash(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        return "Wash: " + name + ". Price: " + price + " kr";
    }

}