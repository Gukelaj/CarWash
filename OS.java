import java.util.ArrayList;
import java.util.Scanner;

public class OS
{
    // Customer
    ArrayList<Washcard> customers = new ArrayList<Washcard>();

    
    Washcard customer1 = new Washcard("Lars", "Larsen", 154.5, "1234");
    Washcard customer2 = new Washcard("Flemming", "Olsen", 910, "9876");
    
    public OS()
    {

    }

    public void addCustomer(Washcard customer)
    {
        customers.add(customer);
    }

    public void print()
    {
        for(int i = 0; i < customers.size(); i++)
        {
            System.out.println(customers.get(i));
        }
    }

    public void startMenu()
    {
        addCustomer(customer1);
        addCustomer(customer2);
        boolean running = true;
        
        while(running) 
        {
            // Login or Buy new WashCard
            System.out.println("Would you like to: 1. Login. 2. Buy WashCard. 3. Quit.");
            System.out.println("Press 1/2/3");
            String login = System.console().readLine();
            System.out.println("==========");
                        
            if(login.equals ("1"))
            {
                login(); 
            }

            else if(login.equals ("2"))
            {
                System.out.println("Enter your Surname:");
                String surName = System.console().readLine();
                System.out.println("Enter your Lastname:");
                String lastName = System.console().readLine();
                System.out.println("Enter the value you want on your WashCard:");
                String washCardBalance = System.console().readLine();
                Double wcb = Double.parseDouble(washCardBalance);
                System.out.println("Enter your Password:");
                String password = System.console().readLine();
        
                Washcard customer3 = new Washcard(surName, lastName, wcb, password);
                System.out.println("==========");
                System.out.println(customer3.toString());
                System.out.println("==========");
                addCustomer(customer3);
            }

            else if(login.equals ("3"))
            {
                running = false;
            }
        }
        statistics();
    }

    public void login()
    {
        System.out.println("Enter Username:");
        String washcard = System.console().readLine();
        System.out.println("==========");

        
        // Enter WashCard (Type surname)
        for(int i = 0; i < customers.size(); i++)
        {
            if(washcard.equals (customers.get(i).getSurName() ))
            {
                        
                // Enter password
                for(int y = 0; y < 3; y++) 
                {
                    System.out.println("Enter Password:");
                    String password = System.console().readLine();
                    System.out.println("==========");

                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (Exception e)
                    {
                        Thread.currentThread().interrupt();
                    }

                    if(password.equals (customers.get(i).getPassword() ))
                    {
                        runMenu(customers.get(i));
                        break;
                    } 
                }
                break;
            }
        }


    }

    public void runMenu(Washcard customer)
    {
        // Card running
        boolean test = true;

        while(test)
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Wash your Car");
            System.out.println("2. Refill your washcard");
            System.out.println("3. Get your balance");
            System.out.println("4. Quit");
            System.out.println("Press (1/2/3/4)");

            String input = System.console().readLine();
                        
            // Wash car
            if(input.equals("1")) 
            {
                customer.carwash();
            }

            // Refill WashCard
            else if(input.equals("2")) 
            {
                customer.refill();
            }

            // Get balance
            else if(input.equals("3")) 
            {
                System.out.println("==========");
                customer.getWashCardBalance();
                System.out.println("==========");
            }
                                
            // Quit
            else if(input.equals("4")) 
            {
                System.out.println("Thanks for using Star CarWash"); 
                System.out.println("==========");
                test = false;
            }
                                
            // Error option
            else
            {
                System.out.println("Invalid option");                
            }                      
        }
    } 
     
    public void statistics()
    {
        System.out.println("Do you want to see the statistics?");
        String statics = System.console().readLine();

        if (statics.equals("y"))
        {
            System.out.println("Washes Customers have bought:");
            for(int i = 0; i < customers.size(); i++)
            {
                customers.get(i).printArray();
            }
            System.out.println("==========");
        }
          else 
        {
            System.out.println("==========");
        }             
    }
          

}

