package _87_try_try_again;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		double a = 0;
		double b = 0;
		String sign = "";
		double result = 0;
		
		System.out.println("Welcome to the console's calculator");
		
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 try{
			 System.out.println("Please enter first number:");
		   a = Double.parseDouble(reader.readLine());
		   		System.out.println("Please enter second number:");
		   b = Double.parseDouble(reader.readLine());
		   	System.out.println("Please enter the sign of the operation wanted:");
		   	System.out.println("Options are: +, -, *, / ");
		   sign = reader.readLine();
		 } catch (NumberFormatException e) {
			 System.out.println("This is not a number!");
			 e.printStackTrace();{		}
		 } catch (IOException e){
			 System.out.println("Problem with reading your input.");
			 e.printStackTrace();
		 }

	
	switch(sign){
	case "+":
		result = calc.add(a, b);
		System.out.println("The result is:");
		System.out.println(result);
		break;
	case "-":
		result = calc.subtract(a, b);
		System.out.println("The result is:");
		System.out.println(result);
		break;
	case "*":
		result = calc.multiply(a, b);
		System.out.println("The result is:");
		System.out.println(result);
		break;
	case "/":
		result = calc.divide(a, b);
		System.out.println("The result is:");
		System.out.println(result);
		break;
	default:
		System.out.println("Wrong sign");
			
		
		}
	}
		
		
	}
			
