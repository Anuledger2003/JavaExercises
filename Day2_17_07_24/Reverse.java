package javaexercises1;

import java.util.Scanner;

public class Reverse {
	/*
	 51) Write a program to display the number in reverse order without use of String functions.
			Eg 1:  Input: 12345
			Output :The number in reverse order is : 54321
	 */
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = obj.nextInt();
		int reverse = 0 ;
		
		while(num!= 0) {
			
			int value = num%10;
			reverse = reverse * 10 + value ;
			num = num/10;
		}
		
		System.out.println("The reverse num is : " + reverse );

	}

}
