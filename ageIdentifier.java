import java.util.Scanner;

public class main{
	public static void main(String[]args) {
		
		Scanner ace = new  Scanner (System.in);
		System.out.println("Enter your age:");
		int var = ace.nextInt();
		
		if (var <= 19) {
			
			System.out.println("Young" + ace);
			
		}
		else if (var <= 60 && var >=21) {
			
			System.out.println("Senior" + ace);
			
		}
		else if (var == 20) {
			
			System.out.println ("Adult" + ace);
			
		}
		else {
			
			System.out.println("error" + ace);
			
		}
	}
}
