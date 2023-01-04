import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner (System.in);
        int numCorrect = 0;
	    String q []  = new String[20];
	    String  [] a = new String[20];
	    String  [] b = new String[20];
	    String  [] c = new String[20];
	    String  [] d = new String[20];
	    String [] ans = new String[20];
	    String [] validletter = new String [4];
	    validletter [0] = "a";
        validletter [1] = "b";
        validletter [2] = "c";
        validletter [3] = "d";
	    
	    //questions
	    q[0] = "1. How many blue stripes are there on the U.S. flag?";
	    q[1] = "2. Which one of these characters is not friends with Harry Potter?";
	    q[2] = "3. What is the color of Donald Duck’s bowtie?";
	    q[3] = "4. Which animal does not appear in the Chinese zodiac?";
	    q[4] = "5. Which country held the 2016 Summer Olympics?";
	    q[5] = "6. Which planet is the hottest?";
	    q[6] = "7. Who was the only U.S. President to resign?";
	    q[7] = "8. What does the “D” in “D-Day” stand for?";
	    q[8] = "9. In which city can you find the Liberty Bell?";
	    q[9] = "10. In Pirates of the Caribbean, what was the name of Captain Jack Sparrow’s ship?";
	    q[10] = "11. What is the rarest blood type?";
	    q[11] = "12. How many bones are there in the human body?";
	    q[12] = "13. Fe is the chemical symbol for…";
	    q[13] = "14. What language is the most spoken worldwide?";
	    q[14] = "15. What year did Barbie come out?";
	    q[15] = "16. What is Shakespeare’s shortest tragedy?";
	    q[16] = "17. How many hearts does an octopus have?";
	    q[17] = "18. Which planet in our solar system is the largest?";
	    q[18] = "19. Who painted the Sistine Chapel ceiling?";
	    q[19] = "20. Which ocean is the largest?";
	    
	    //choices
	    a[0] = "6";
	    b[0] = "7";
	    c[0] = "13";
	    d[0] = "0";
	    
	    a[1] = "Ron Weasley";
	    b[1] = "Neville Longbottom";
	    c[1] = "Draco Malfoy";
	    d[1] = "Hermione Granger";
	    
	    a[2] = "Red";
	    b[2] = "Yellow";
	    c[2] = " Blue";
	    d[2] = "White";
	    
	    a[3] = "Dragon";
	    b[3] = "Rabbit";
	    c[3] = "Dog";
	    d[3] = "Hummingbird";
	    
	    a[4] = "China";
	    b[4] = "Ireland";
	    c[4] = "Brazil";
	    d[4] = "Italy";
	    
	    a[5] = "Venus";
	    b[5] = "Saturn";
	    c[5] = "Mercury";
	    d[5] = "Mars";
	    
	    a[6] = "Herbert Hoover";
	    b[6] = "Richard Nixon";
	    c[6] = "George W. Bush";
	    d[6] = "Barack Obama";
	    
	    a[7] = "Dooms";
	    b[7] = "Dark";
	    c[7] = "Dark";
	    d[7] = "Dunkirk";
	    
	    a[8] = "Washington, D.C.";
	    b[8] = "Boston";
	    c[8] = "Philadelphia";
	    d[8] = "Manhattan";
	    
	    a[9] = "The Marauder";
	    b[9] = "The Black Pearl";
	    c[9] = "The Black Python";
	    d[9] = "The Slytherin";
	    
	    a[10] = "O";
	    b[10] = "A";
	    c[10] = "B";
	    d[10] = "AB-Negative";
	    
	    a[11] = "206";
	    b[11] = "205";
	    c[11] = "201";
	    d[11] = "209";
	   
	    a[12] = "Zinc";
	    b[12] = "Hydrogen";
	    c[12] = "Fluorine";
	    d[12] = "Iron";
	    
	    a[13] = "Chinese";
	    b[13] = "Spanish";
	    c[13] = "Arabic";
	    d[13] = "English";
	    
	    a[14] = "1958";
	    b[14] = "1959";
	    c[14] = "1956";
	    d[14] = "1961";
	    
	    a[15] = "Macbeth";
	    b[15] = "Hamlet";
	    c[15] = "Romeo & Juliet";
	    d[15] = "Othello";
	    
	    a[16] = "1";
	    b[16] = "2";
	    c[16] = "3";
	    d[16] = "4";
	    
	    a[17] = "Jupiter";
	    b[17] = "Saturn";
	    c[17] = "Neptune";
	    d[17] = "Earth";
	    
	    a[18] = "Picasso";
	    b[18] = "Da Vinci";
	    c[18] = "Michelangelo";
	    d[18] = "Van Gogh";
	    
	    a[19] = "Indian";
	    b[19] = "Pacific";
	    c[19] = "Atlantic";
	    d[19] = "Arctic";
	    
	    //answers
	    ans[0] = "d";
	    ans[1] = "c";
	    ans[2] = "a";
	    ans[3] = "d";
	    ans[4] = "c";
	    ans[5] = "a";
	    ans[6] = "b";
	    ans[7] = "d";
	    ans[8] = "c";
	    ans[9] = "b";
	    ans[10] = "d";
	    ans[11] = "a";
	    ans[12] = "d";
	    ans[13] = "a";
	    ans[14] = "b";
	    ans[15] = "a";
	    ans[16] = "c";
	    ans[17] = "a";
	    ans[18] = "c";
	    ans[19] = "b";
	    
	    
	    
        //intro
        System.out.println ("Welcome to TriviaGo Quizbee!");
        System.out.println();
        String answer;
        
        //question 1
		System.out.println(q[0]);
		System.out.println("A. " + a[0]);
		System.out.println("B. " + b[0]);
		System.out.println("C. " + c[0]);
		System.out.println("D. " + d[0]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[0])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[0]);
		}
		
		//question 2
		System.out.println();
		System.out.println(q[1]);
		System.out.println("A. " + a[1]);
		System.out.println("B. " + b[1]);
		System.out.println("C. " + c[1]);
		System.out.println("D. " + d[1]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[1])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[1]);
		}
		//question 3
		System.out.println();
		System.out.println(q[2]);
		System.out.println("A. " + a[2]);
		System.out.println("B. " + b[2]);
		System.out.println("C. " + c[2]);
		System.out.println("D. " + d[2]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[2])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[2]);
		}
		//question 4
		System.out.println();
		System.out.println(q[3]);
		System.out.println("A. " + a[3]);
		System.out.println("B. " + b[3]);
		System.out.println("C. " + c[3]);
		System.out.println("D. " + d[3]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[3])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[3]);
		}
		//question 5
		System.out.println();
		System.out.println(q[4]);
		System.out.println("A. " + a[4]);
		System.out.println("B. " + b[4]);
		System.out.println("C. " + c[4]);
		System.out.println("D. " + d[4]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[4])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[4]);
		}
		//question 6
		System.out.println();
		System.out.println(q[5]);
		System.out.println("A. " + a[5]);
		System.out.println("B. " + b[5]);
		System.out.println("C. " + c[5]);
		System.out.println("D. " + d[5]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[5])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[5]);
		}
		//question 7
		System.out.println();
		System.out.println(q[6]);
		System.out.println("A. " + a[6]);
		System.out.println("B. " + b[6]);
		System.out.println("C. " + c[6]);
		System.out.println("D. " + d[6]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[6])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[6]);
		}
		//question 8
		System.out.println();
		System.out.println(q[7]);
		System.out.println("A. " + a[7]);
		System.out.println("B. " + b[7]);
		System.out.println("C. " + c[7]);
		System.out.println("D. " + d[7]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[7])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[7]);
		}
		//question 9
		System.out.println();
		System.out.println(q[8]);
		System.out.println("A. " + a[8]);
		System.out.println("B. " + b[8]);
		System.out.println("C. " + c[8]);
		System.out.println("D. " + d[8]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[8])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[8]);
		}
		//question 10
		System.out.println();
		System.out.println(q[9]);
		System.out.println("A. " + a[9]);
		System.out.println("B. " + b[9]);
		System.out.println("C. " + c[9]);
		System.out.println("D. " + d[9]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[9])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[9]);
		}
		//question 11
		System.out.println();
		System.out.println(q[10]);
		System.out.println("A. " + a[10]);
		System.out.println("B. " + b[10]);
		System.out.println("C. " + c[10]);
		System.out.println("D. " + d[10]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[10])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[10]);
		}
		
		//question 12
		System.out.println();
		System.out.println(q[11]);
		System.out.println("A. " + a[11]);
		System.out.println("B. " + b[11]);
		System.out.println("C. " + c[11]);
		System.out.println("D. " + d[11]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[11])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[11]);
		}
		//question 13
		System.out.println();
		System.out.println(q[12]);
		System.out.println("A. " + a[12]);
		System.out.println("B. " + b[12]);
		System.out.println("C. " + c[12]);
		System.out.println("D. " + d[12]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[12])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[12]);
		}
		//question 14
		System.out.println();
		System.out.println(q[13]);
		System.out.println("A. " + a[13]);
		System.out.println("B. " + b[13]);
		System.out.println("C. " + c[13]);
		System.out.println("D. " + d[13]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[13])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[13]);
		}
		//question 15
		System.out.println();
		System.out.println(q[14]);
		System.out.println("A. " + a[14]);
		System.out.println("B. " + b[14]);
		System.out.println("C. " + c[14]);
		System.out.println("D. " + d[14]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[14])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[14]);
		}
		//question 16
		System.out.println();
		System.out.println(q[15]);
		System.out.println("A. " + a[15]);
		System.out.println("B. " + b[15]);
		System.out.println("C. " + c[15]);
		System.out.println("D. " + d[15]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[15])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[15]);
		}
		//question 17
		System.out.println();
		System.out.println(q[16]);
		System.out.println("A. " + a[16]);
		System.out.println("B. " + b[16]);
		System.out.println("C. " + c[16]);
		System.out.println("D. " + d[16]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[16])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[16]);
		}
		//question 18
		System.out.println();
		System.out.println(q[17]);
		System.out.println("A. " + a[17]);
		System.out.println("B. " + b[17]);
		System.out.println("C. " + c[17]);
		System.out.println("D. " + d[17]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[17])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[17]);
		}
		//question 19
		System.out.println();
		System.out.println(q[18]);
		System.out.println("A. " + a[18]);
		System.out.println("B. " + b[18]);
		System.out.println("C. " + c[18]);
		System.out.println("D. " + d[18]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[18])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[18]);
		}
		//question 20
		System.out.println();
		System.out.println(q[19]);
		System.out.println("A. " + a[19]);
		System.out.println("B. " + b[19]);
		System.out.println("C. " + c[19]);
		System.out.println("D. " + d[19]);
		System.out.print("Enter your answer: ");
		answer = scan.nextLine();
		
		if (answer.equalsIgnoreCase(ans[19])){
		    System.out.println("Your answer is correct.");
		    numCorrect+=1;
		}
		else {
		    System.out.println("Wrong. The correct answer is: "+ ans[19]);
		}
		
		int totalQuestions = 20;
		double score = (100.0*numCorrect) / totalQuestions;
		System.out.println();
		System.out.print("You scored: " + score+"%");
		
		
	}
}