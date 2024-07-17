package javaexercises1;

import java.util.Scanner;

public class Longkeyword {
	//26) Program to Demonstrate the Working of Keyword long
	public static void main(String[] args ) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Let's demonstrate Long Keyword !!!\n");
		
		long num = 9223372036854775807L ;
		int num1 = (int) num ;
		
		System.out.println("The value initialized in long keyword is : "+num+"\n");
		System.out.println("This long Keyword can hold the value of \n- 9223372036854775808 to 9223372036854775807\n");
		
		System.out.println("Let's convert long into int type to see the difference : \n");
		System.out.println("The int type value for long var is : "+num1+"\n");
		System.out.println("We can see the difference right !!!! ") ;
	}

}
