public class Run 
{
    public static void main(String[] args) 
    {
        // Customer
        Washcard customer1 = new Washcard("Lars", "Larsen", 154.5, "1234");
        

        // CarWash Startup
        System.out.println("Enter Username:");
        String washcard = System.console().readLine();
        System.out.println("==========");

        // Enter WashCard (Type surname)
        if(washcard.equals (customer1.getSurName() ))
        {
            
            // Enter password
            for(int i = 0; i < 3; i++) 
            {
                System.out.println("Enter Password:");
                String password = System.console().readLine();
                System.out.println("==========");

                if(password.equals (customer1.getPassword() ))
                {
                    
                    // CardWash running
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
                            customer1.carwash();
                        }

                        // Refill WashCard
                        else if(input.equals("2")) 
                        {
                            customer1.refill();
                        }

                        // Get balance
                        else if(input.equals("3")) 
                        {
                            System.out.println("==========");
                            customer1.getWashCardBalance();
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

                break;
                }   
            }
        }
    }
}