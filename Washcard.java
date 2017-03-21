public class Washcard 
{
    
    private String surName;
    private String lastName;
    private double washCardBalance;
    
    public Washcard(String surname, String lastName, double washCardBalance) 
    {
        this.surName = surName;
        this.lastName = lastName;
        this.washCardBalance = washCardBalance; 
    }
    
    public double getBalance() 
    {
        return washCardBalance;
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
   
    public void carwash() 
    {
       

        System.out.println("Choose Wash?");
        System.out.println("1. Diamond 400 kr");
        System.out.println("2. Gold 300 kr");
        System.out.println("3. Silver 200 kr");
        System.out.println("4. Bronze 100 kr");
        String input = System.console().readLine();
        
        if(input.equals("1") && (washCardBalance >= 400)) 
        {
            washCardBalance -= 400;
            System.out.print("Would you like a receipt? (y/n)");
            String input2 = System.console().readLine();
            if(input2.equals("y")) 
            {
                System.out.println("Diamond wash 400kr");
                System.out.println("Current balance: " + washCardBalance);
                System.out.println("==========");
            }  
            else 
            {
                System.out.println("==========");
            }              
            
        }

        else if(input.equals("2") && (washCardBalance >= 300)) 
        {
            washCardBalance = washCardBalance - 300;
            System.out.print("Would you like a receipt? (y/n)");
            String input2 = System.console().readLine();
            if(input2.equals("y")) 
            {
                System.out.println("Gold wash 300kr");
                System.out.println("Current balance: " + washCardBalance);
                System.out.println("=========="); 
            }   
            else 
            {
                System.out.println("==========");
            }              
         }

        else if(input.equals("3") && (washCardBalance >= 200)) 
        {
            washCardBalance = washCardBalance - 200;
            System.out.print("Would you like a receipt? (y/n)");
            String input2 = System.console().readLine();
            if(input2.equals("y")) 
            {
                System.out.println("Silver wash 200kr");
                System.out.println("Current balance: " + washCardBalance); 
                System.out.println("==========");
            }   
            else 
            {
                System.out.println("==========");
            }              
         }
        else if(input.equals("4") && (washCardBalance >= 100)) 
        {
            washCardBalance = washCardBalance - 100;
            System.out.print("Would you like a receipt? (y/n)");
            String input2 = System.console().readLine();
            if(input2.equals("y")) 
            {
                System.out.println("Bronze 100kr");
                System.out.println("Current balance: " + washCardBalance); 
                System.out.println("==========");
            }  
            else 
            {
                System.out.println("==========");
            }               
         }
        
        else 
        {
            System.out.println("The Customer dosn't have enough funds available!!");
            System.out.println("==========");
             
        }
    }
  

}