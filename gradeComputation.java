import java.util. *;
import java.text. *;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat ("#.##");
		
		String name;
		double sub1, sub2, sub3,sub4,sub5,sub6,sub7, Ave, Sum;
		
		System.out.print("Enter name:");
		name = scan.nextLine();
		
		System.out.println("Enter grade for General Mathematics:");
		sub1 = scan.nextDouble();
		
		System.out.println("Enter grade for Web Programming 2:");
		sub2 = scan.nextDouble();
		
		System.out.println("Enter grade for 21st Century Literature:");
		sub3 = scan.nextDouble();
		
		System.out.println("Enter grade for Introduction to Philosophy:");
		sub4 = scan.nextDouble();
		
		System.out.println("Enter grade for Media and Information Literacy:");
		sub5 = scan.nextDouble();
		
		System.out.println("Enter grade for Computer Programming:");
		sub6 = scan.nextDouble();
		
		System.out.println("Enter grade for Oral Communication:");
		sub7 = scan.nextDouble();
		
		Sum = (double) (sub1+sub2+sub3+sub4+sub5+sub6+sub7);
		Ave = (double) (Sum) / 7;
		System.out.println("Your General Average: " + f.format(Ave));
		
		if (Ave >= 75 && Ave <= 100) {
		    System.out.println ("Passed");
		}
		else if (Ave <=74) {
		    System.out.println ("Failed");
		}
		else {
		    System.out.println ("Invalid Input");
		}
	}
}