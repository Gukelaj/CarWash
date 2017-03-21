public class Run 
{
    public static void main(String[] args) 
    {
        
        Washcard customer1 = new Washcard("Lars","Larsen",154.5);

        for(int i = 0; i <= 20; i++) 
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Wash your Car");
            System.out.println("2. Refill your washcard");
            System.out.println("3. Get your balance");
            System.out.println("4. Quit");
            String input = System.console().readLine();
        
            if(input.equals("1")) 
            {
                customer1.carwash();
            }

            else if(input.equals("2")) 
            {
                System.out.print("Which amount do you want to add?");
                String input1 = System.console().readLine();
                int hp = Integer.parseInt(input1);
                customer1.addValue(hp);
                System.out.println("Your current balance: " + customer1.getBalance());
                System.out.println("=========="); 
            }

            else if(input.equals("3")) 
            {
                customer1.getWashCardBalance();
                System.out.println("==========");
            }
            
            else if(input.equals("4")) 
            {
                System.out.println("Thanks for using Star CarWash"); 
                System.out.println("==========");
                break;
            }
            
            else
            {
                System.out.println("Invalid option");                
            }

        }
        // System.out.print("Would you like a receipt? (y/n)");
        //     String input2 = System.console().readLine();
        //     if(input2.equals("y")) {
                
        //     }
    }
}