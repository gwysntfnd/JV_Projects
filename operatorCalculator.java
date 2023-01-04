import java.util.Scanner;
public class operators {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String selection,again;
		int a,b,c;
		
    do {
    	
		String operators[] = new String[5];
		   operators[0] = "[+]Addition";
		   operators[1] = "[-]Subtraction";
		   operators[2] = "[x]Multiplication";
		   operators[3] = "[/]Division";
		   operators[4] = "[%]Modulo";
		   System.out.println(operators[0]+operators[1]+operators[2]+operators[3]+operators[4]);
		   
		   System.out.println("Enter number:");
		   a=scan.nextInt();
		   System.out.println("Enter sign:");
		   selection=scan.next();
		   System.out.println("Enter number:");
		   b=scan.nextInt();

		   //formulas
		   int add = a + b;
		   int sub = a - b;
		   int mul = a * b;
		   int div = a / b;
		   int mod = a % b;
		   
		   //process
		   if(selection.equals("+")) {
			   System.out.println("The Sum: " + add);
			   System.out.println("Full Calculation: " + a + " + " + b + " = " + add );
		   }
		   else if(selection.equals("-")) {
			   System.out.println("The Difference: " + sub);
			   System.out.println("Full Calculation: " + a + " - " + b + " = " + sub );
		   }
		   else if(selection.equals("x")) {
			   System.out.println("The Product: " + mul);
			   System.out.println("Full Calculation: " + a + " x " + b + " = " + mul );
		   }
		   else if(selection.equals("/")) {
			   System.out.println("The Quotient: " + div);
			   System.out.println("Full Calculation: " + a + " / " + b + " = " + div );
		   } 
		   else if(selection.equals("%")) {
			   System.out.println("The Remainder: " + mod);
			   System.out.println("Full Calculation: " + a + "(" + b + "*" + mod + ")+" + mod );
		   } 
		   else {
			   System.out.println("Entered wrong method.");
		   }
		   
		   // Try again.
		   
		   System.out.println("Would you like to convert again? [Y or N]");
		   again = scan.next();
		   
	      }
	
			while (again.equalsIgnoreCase("y"));
      }
}