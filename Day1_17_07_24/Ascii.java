package javaexercises1;

import java.util.Scanner;

public class Ascii {
	//24) Program to Find ASCII Value of a Character
	public static void main(String[] args ) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Character : ") ;
		char character = obj.next().charAt(0);
		
		int answer = character ;
		
		System.out.println("The ASCII Value for given Character "+ character + " is :"+answer);
			
	}

}
