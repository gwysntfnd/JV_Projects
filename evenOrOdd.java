import java.util.*;
public class Main {

    public static void main (String[]args) {

        Scanner scan = new Scanner (System.in);
        int num;

        System.out.println("Enter a number:");
        num = scan.nextInt();
 

        if ( num % 2 == 0 )
            System.out.println("Entered number is even");
         else
            System.out.println("Entered number is odd");


    }

}