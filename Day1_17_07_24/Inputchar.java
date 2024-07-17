package javaexercises1;

import java.util.Scanner;

public class Inputchar {
	/*
	 2) Write a program to print a letters from the user input character to 'Z' without using strings.
			Example 1:  input : X
			Output : XYZ
			Example 2:  Input : M
			Output : MNOPQRSTUWXYZ
	 */
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Character");
		char character = obj.next().charAt(0);
		
		int equalval = character ;
		
		for(int i = equalval ; i <= 90 ; i++) {
			char answer = (char) i ;
			System.out.print(answer+" ");
		}
	}

}
