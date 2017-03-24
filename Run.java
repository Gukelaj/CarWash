public class Run 
{
    public static void main(String[] args) 
    {
        // Customer
        Washcard customer1 = new Washcard("Lars", "Larsen", 154.5, "1234");
        Washcard customer2 = new Washcard("Flemming", "Olsen", 910, "9876");
        
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

                else if(washcard.equals (customer2.getSurName() ))
                {
                    
                    // Enter password
                    for(int i = 0; i < 3; i++) 
                    {
                        System.out.println("Enter Password:");
                        String password = System.console().readLine();
                        System.out.println("==========");

                        if(password.equals (customer2.getPassword() ))
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
                                    customer2.carwash();
                                }

                                // Refill WashCard
                                else if(input.equals("2")) 
                                {
                                    customer2.refill();
                                }

                                // Get balance
                                else if(input.equals("3")) 
                                {
                                    System.out.println("==========");
                                    customer2.getWashCardBalance();
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

            }

            else if(login.equals ("3"))
            {
                running = false;
            }
        }


        Statistic[] st = new Statistic[5];
        st[0] = new Statistic("Lars", "Larsen");

        System.out.println("Do you want to see the statistics?");
        String statics = System.console().readLine();

        if (statics.equals("y"))
        {
        //her skal vi få den til at printe den vask der er valgt?!?!
        System.out.println(st[0].getSurName() + " " + st[0].getLastName()); //+ "bought the" + toString());
        }
          else 
        {
            System.out.println("==========");
        }

    }
}