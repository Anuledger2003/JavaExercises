package javaexercises1;

import java.util.Scanner;

public class Quotientremainder {
	//25) Program to Compute Quotient and Remainder
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Dividend : ");
		int dividend = obj.nextInt();
		System.out.println("Enter the Divisor : ") ;
		int divisor = obj.nextInt();
		
		float quotient = dividend / divisor ;
		float remainder = dividend % divisor ;
		
		System.out.println("The Quotient is : "+quotient);
		System.out.println("The Remainder is : "+remainder);
		
	}

}
