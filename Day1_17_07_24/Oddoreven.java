package javaexercises1;

import java.util.Scanner;

public class Oddoreven {
	//28) Program to Check Whether a Number is Even or Odd
	public static void main(String[] args) {
		System.out.println("Let's find the number is ODD or EVEN !!!");
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int num1 = obj.nextInt();
		
		if(num1 <= 0) {
			System.out.println("Enter the Positive value ");
		}
		else if((num1%2) == 0) {
			System.out.println("The Given Value "+num1+" is EVEN Number");
		}
		else {
			System.out.println("The Given Value "+num1+" is ODD Number");
		}	
	}
}
