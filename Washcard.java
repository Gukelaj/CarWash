import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;



public class Washcard 
{
    private String surName;
    private String lastName;
    private double washCardBalance;
    private String password;
    
    CarWash carwash1 = new CarWash("Diamond", 400);
    CarWash carwash2 = new CarWash("Gold", 300);
    CarWash carwash3 = new CarWash("Silver", 200);
    CarWash carwash4 = new CarWash("Bronze", 100);
    

    public Washcard(String surName, String lastName, double washCardBalance, String password) 
    {
        this.surName = surName;
        this.lastName = lastName;
        this.washCardBalance = washCardBalance;
        this.password = password; 
    }

    public double getBalance() 
    {
        return washCardBalance;
    }

    public String getSurName() 
    {
        return surName;
    }
    
    public String getPassword() 
    {
        return password;
    }

    public String toString()
    {
        return "Name: " + surName + " " + lastName + ". Balance: " + washCardBalance + ".";
    }

    public void getWashCardBalance() 
    {
        System.out.println("Your current balance is: " + getBalance() + "kr");
    }

    public void addValue(double x) 
    {
        if(x <= 1000 && washCardBalance < 1000) 
        {
            washCardBalance = washCardBalance + x;
        }
        else 
        {
            System.out.println("Error. Either you tried to add over 1000 kr, or your current balance is over 1000 kr.");
        }

    }
    
    public void receipt(String x)
    {
        System.out.print("Would you like a receipt? (y/n) ");
        String input2 = System.console().readLine();
        if(input2.equals("y")) 
        {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            System.out.println("==========");
            System.out.println("Receipt");
            System.out.println(dateFormat.format(date));
            System.out.println(x);
            System.out.println("Current balance: " + getBalance() + " kr");
            System.out.println("Thanks for using Star CarWash"); 
            System.out.println("==========");
        }
        
        else 
        {
            System.out.println("==========");
        }
    }  

    public void carwash() 
    {
        System.out.println("Choose Wash?");
        System.out.println("1. " + carwash1.toString());
        System.out.println("2. " + carwash2.toString());
        System.out.println("3. " + carwash3.toString());
        System.out.println("4. " + carwash4.toString());
        String input = System.console().readLine();
        
        if(input.equals("1") && (washCardBalance >= carwash1.getPrice())) 
        {
            washCardBalance -= carwash1.getPrice();
            receipt(carwash1.toString());   
        }

        else if(input.equals("2") && (washCardBalance >= carwash2.getPrice())) 
        {
            washCardBalance -= carwash2.getPrice();
            receipt(carwash2.toString());        
        }

        else if(input.equals("3") && (washCardBalance >= carwash3.getPrice())) 
        {
            washCardBalance -= carwash3.getPrice();
            receipt(carwash3.toString());
        }

        else if(input.equals("4") && (washCardBalance >= carwash4.getPrice())) 
        {
            washCardBalance -= carwash4.getPrice();
            receipt(carwash4.toString()); 
         }
        
        else 
        {
            System.out.println("The Customer dosn't have enough funds available!!");
            System.out.println("==========");
             
        }
    }

    public void refill()
    {
        System.out.print("Which amount do you want to add? ");
        String input1 = System.console().readLine();
        int hp = Integer.parseInt(input1);
        addValue(hp);
        System.out.println("==========");
        System.out.println("Your current balance: " + getBalance());
        System.out.println("=========="); 
    }
  

}