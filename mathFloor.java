import java.util.Scanner;
import java.text.DecimalFormat;
 
public class main{
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat ("#");

        try {
 
                
            String again, free = "bawal libre";
            int wallet = 100, input, change;            
 
            System.out.println("You have PHP 100.00. \n Input value:");
            input = scan.nextInt();
            System.out.println("Input:"+input);

            change = wallet - input;

            //Out of 100

            if (input >= 100) {
                System.out.println(free);
            }


            //The code for 10

             int tens = change / 10;
             if (input==0) {
                 System.out.println(free);
             }
             else if (tens > 0) {
             change = change % 10;
             System.out.println("TEN:" + f.format( Math.floor(tens)));
             }
 
                
             //The code for 5

             int fives = change / 5;
             if (input==0) {
                 System.out.println(free);
             }
             else if (fives > 0) {
             change = change % 5;
             System.out.println("FIVE:" + f.format (Math.floor(fives)));
             }

             //The code for 1

             int ones = change / 1;
             if (input==0) {
                 System.out.println(free);
             }
             else if (ones > 0) {
             change = change % 1;
             System.out.println("ONE:" + f.format(Math.floor(ones)));

             }   
        }
        catch(Exception NumberFormatException) {
            System.out.println("Error occured. Try again later.");    
        }
        finally {
            System.out.println("Thank you for using the app!");
      }

    }
}