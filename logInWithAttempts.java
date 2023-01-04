import java.util.Scanner;
public class Main{

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int attempts = 0;
       int count = 4;
       
       System.out.println("Good Day! Returning user, Please Log in first.");
       System.out.println("");
       
       while(attempts < 4){
        System.out.println("Enter your username: ");
        String user = scan.nextLine();
        
        System.out.println("Enter your password: ");
        String  pass = scan.nextLine();
    
        if(user.equalsIgnoreCase("asdfg") && pass.equals("asdfg123")){
           
            System.out.println("Welcome back " + user + ".");
            
            break;
        
        }
        else if(attempts <3) {
            count-=1;
            System.out.println("");
            System.out.println("Incorrect, Please Try Again "+ "(" + count + " attempts remaining)");
            System.out.println("");
        }
          
        else{
    
            System.out.println("Sorry too many attempts, Please try again later.");
        
        }
        
        attempts++; 
        
       }
   }
}