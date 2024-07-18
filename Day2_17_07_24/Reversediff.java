package javaexercises1;

import java.util.Scanner;

public class Reversediff {
	/*
	 3) write a program to find the difference between the given number and it's reverse number.
		Example 1: Input : 12345
		Output : 12345 - 54321 = -41976
		Example 2: Input : 543
		Output : 543 - 345 = 198
	 */
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ") ;
		int num = obj.nextInt() ;
		int firstval = num ;
		int reverse = 0 ;
		
		while(num != 0) {
			int value = num%10 ;
			reverse = reverse * 10 + value ;
			num = num/10 ;
		}
		System.out.println("The Reverse value : " +reverse);
		int difference = firstval -reverse ;
		
		System.out.println("The Difference between "+ firstval +" - "+reverse+" : " +difference);
		
	}

}
