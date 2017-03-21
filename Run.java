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
            System.out.println("Press (1/2/3/4)");

            String input = System.console().readLine();
        
            if(input.equals("1")) 
            {
                customer1.carwash();
            }

            else if(input.equals("2")) 
            {
                customer1.refill();
            }

            else if(input.equals("3")) 
            {
                System.out.println("==========");
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

    }
}