import java.util.Scanner;

public class Main
{

   public static void main(String[] args) 
   {

       Scanner userInput = new Scanner(System.in);
       
       int attempts;
           
       attempts = 0;
    
       while(attempts < 3)
       {
           
        System.out.print("Enter your username: ");
        String user = userInput.nextLine();
        
        System.out.print("Enter your password: ");
        String  pass = userInput.nextLine();
    
        if(user.equalsIgnoreCase("GraceGarces") && pass.equals("Grace321"))
        {
           
            System.out.println("Welcome back " + user + ".");
            
            break;
        
        }
        else if(attempts <2) 
        {
            System.out.println("Incorrect Please Try Again");
        }
          
        else
        {
    
            System.out.println("Sorry too many attempts, Please try again later.");
        
        }
    
        attempts++;
       }
   }
}