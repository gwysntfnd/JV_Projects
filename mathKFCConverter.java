import java.text.DecimalFormat;
import java.util.*;
public class asdfgh
{
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		DecimalFormat f = new DecimalFormat ("#.###");
		
//Once Again
	String again;
		do {
		System.out.println(" WELCOME TO KFC CALCULATOR!");
			
		String value[] = new String [3];
		value[0]= "[a]Kelvin ";
		value[1]= "[b]Fahrenheit ";
		value[2]= "[c]Celsius ";
		System.out.println(value[0]+value[1]+value[2]);
	
		System.out.println("Convert From:");
		String tempType = scan.next();
		
		System.out.println("Convert To:");
		String tempConvertTo = scan.next();
		
		System.out.println("Please Enter Value:");
		double tempValue = scan.nextDouble();
	    
	    //Formulas---------------------------------------------------------------------------------
		
	    // Fahrenheit --> Celsius & Kelvin
	    double fToC = ((tempValue - 32) * 5 ) / 9;
	    fToC = Math.round(fToC * 100.0) / 100.0F; //Round off two decimal places
	    double fToK = (((tempValue - 32) * 5) / 9) + 273.15F;
	    fToK = Math.round(fToK * 100.0) / 100.0F;//Round off two decimal places
	    
	    // Celsius --> Fahrenheit & Kelvin
	    double cToF = ((tempValue * 9) / 5 ) + 32;
	    cToF = Math.round(cToF * 100.0) / 100.0F;//Round off two decimal places
	    double cToK = tempValue + 273.15F;
	    cToK = Math.round(cToK * 100.0) / 100.0F;//Round off two decimal places
	    
	    //Kelvin --> Fahrenheit & Celsius
		double kToF = ((((tempValue - 273.15F) * 9 ) / 5 ) + 32);
		kToF = Math.round(kToF * 100.0) / 100.0F;//Round off two decimal places
		double kToC = tempValue - 273.15F;
		kToC = Math.round(kToC * 100.0) / 100.0F;//Round off two decimal places
		
		//-----------------------------------------
		
		// fahrenheit --> celsius & kelvin
		String wrongType = "Entered wrong Temperature type, Please try again.";
		String wrongConvertType = "Entered wrong Temperature type, Please try again.";
		
		if (tempType.equalsIgnoreCase("b")) {
		    if(tempConvertTo.equalsIgnoreCase("b")){
		        System.out.println("Fahrenheit:" +tempValue+"°F"+" </> "+"Fahrenheit:"+tempValue+"°F"); //same type
		    }
		    else if (tempConvertTo.equalsIgnoreCase("c")){
		        System.out.println("Fahrenheit:" +tempValue+"°F"+" </> "+"Celsius:"+f.format(fToC)+"°C"); //fahrenheit to celsius
		    }
		    else if (tempConvertTo.equalsIgnoreCase("a")){
		        System.out.println("Fahrenheit:" +tempValue+"°F"+" </> "+"Kelvin:"+f.format(fToK)+"°K"); //fahrenheit to kelvin
		    }
		    else {
		        System.out.println(wrongConvertType);
		    }
		  }
		
		// celsius --> fahrenheit & kelvin
		else if (tempType.equalsIgnoreCase("c")) {
			if(tempConvertTo.equalsIgnoreCase("c")){
				System.out.println("Celsius:" +tempValue+"°C"+" </> "+"Celsius:"+tempValue+"°C"); //same type
			}
			else if (tempConvertTo.equalsIgnoreCase("b")){
				System.out.println("Celsius:" +tempValue+"°C"+" </> "+"Fahrenheit:"+f.format(cToF)+"°F"); //celsius to fahrenheit
			}
			else if (tempConvertTo.equalsIgnoreCase("a")){
				System.out.println("Celsius:" +tempValue+"°C"+" </> "+"Kelvin:"+f.format(cToK)+"°K"); //celsius to kelvin
			}
		    else {
		        System.out.println(wrongConvertType);
		    }
		}
		
		// kelvin --> fahrenheit & celsius
		else if (tempType.equalsIgnoreCase("a")) {
			if(tempConvertTo.equalsIgnoreCase("a")){
				System.out.println("Kelvin:" +tempValue+"°K"+" </> "+"Kelvin:"+tempValue+"°K"); //same type
			}
			else if (tempConvertTo.equalsIgnoreCase("b")){
				System.out.println("Kelvin:" +tempValue+"°K"+" </> "+"Fahrenheit:"+f.format(kToF)+"°F"); //kelvin to fahrenheit
			}
			else if (tempConvertTo.equalsIgnoreCase("c")){
				System.out.println("Kelvin:" +tempValue+"°K"+" </> "+"Celsius:"+f.format(kToC)+"°C");//kelvin to celsius
			}
		    else {
		        System.out.println(wrongConvertType);
		    }
		}
		// if temperature isn't one listed
		else {
	        System.out.println(wrongType);
	    }
		
		// Convert Again
		    System.out.println("Would you like to convert again? [Y or N]");
		    again = scan.next();
		}
		
		while (again.equalsIgnoreCase("y"));
			
		
		}
	}
