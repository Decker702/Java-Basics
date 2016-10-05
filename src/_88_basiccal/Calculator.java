package _88_basiccal;

	//YouTube Video by Kevin Olson - How to Create A Simple Calculator in Java
//corresponds to text material at http://txtlearn.com.php/series/

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		//Create the scanner - 
		Scanner userInput = new Scanner(System.in);
			
		//User Input
		System.out.println("Welcome to calculator");
		System.out.println("please enter your first value:");
		double x = userInput.nextDouble();
		System.out.println("Please enter your next value:");
		double y = userInput.nextDouble();
		
		//done using the scanner.  Following closes the scanner
		userInput.close();
		
		//Computations
		
		double sum = x + y;
		double product = x * y;
		double quotient = x / y;
		double remainder = x % y;
		
		//Print out the results
		System.out.println("Results are as follows:");
		System.out.printf("Sum: %f + %f = %f \n",x,y,sum);//the \n makes a new line
		System.out.printf("Product: %f + %f = %f \n" ,x,y,product);
		System.out.printf("Quotient: %f + %f = %f \n",x,y,quotient);
		System.out.printf("Remainder: %f + %f = %f \n",x,y,remainder);
		
		
		
	}

}
