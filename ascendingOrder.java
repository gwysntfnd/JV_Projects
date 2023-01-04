/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
import javax.swing.*;
 
 
 
public class Try {
 
    public static void main(String[] args) {

                String again;
        int n1,n2,n3, temp=0;

        try { 
            do{
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 3:"));
                JOptionPane.showMessageDialog(null,"The ascending Order:");

        for(int i=0;temp!=3;i++)    
        if(i==n1||i==n2||i==n3)
        {

            JOptionPane.showMessageDialog(null,i);
            temp++;
        }
                    again = JOptionPane.showInputDialog(null,"Would you like to try again? [Y or N]");
        }

                    while (again.equalsIgnoreCase("y"));


                }
         catch(Exception NumberFormatException)
            {
                JOptionPane.showMessageDialog(null,"Error occured. Try again later.");
            }
                finally {
                      JOptionPane.showMessageDialog(null,"Thank you for using the app.");
                }
}
}