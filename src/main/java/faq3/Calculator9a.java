package faq3;

import java.util.Scanner;

public class Calculator9a {

	public static void main(String[] args) {
		// Calculator using switch case
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("enter two numbers: ");
		
		double first = reader.nextDouble();
		double second = reader.nextDouble();
		
		System.out.println("Please enter an operator: (+, -, *, /): ");
		
		char operator = reader.next().charAt(0);
	
		double result = 0;
		
		switch (operator) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;


		default:
			System.out.println("Plz pass the correct operator");
			break;
		}
       System.out.println(result);
	}

}
