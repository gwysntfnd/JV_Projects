import java.util.Arrays;
import javax.swing.*;
 

public class Try {

    public static void main(String[] args) {

        String again;
        int n[] = new int[3];
 
    try{
        do {
 
        for (int i = 0 ; i < 3 ; i++ ){

            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Number "+(i+1)+":"));

        }
 
           Arrays.sort(n);

            for (int i = 0; i < 3 ; i++){

                JOptionPane.showMessageDialog(null,"Ascending Numbers : \n" + n[i]);
            }

               JOptionPane.showMessageDialog(null,"Result : \n" + n[0] +", "+ n[1] +", "+ n[2]  );

            again = JOptionPane.showInputDialog(null,"Would you like to convert again? [Y or N]");  

            }
            while (again.equalsIgnoreCase("y")); 
            }


         catch (Exception NumberFormatException) {
              JOptionPane.showMessageDialog(null,"Error occured. Try again later.");
          }
         finally {
        JOptionPane.showMessageDialog(null,"Thank you for using the app.");
         } 
     }
}