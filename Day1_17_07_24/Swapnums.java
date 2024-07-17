package javaexercises1;

import java.util.Scanner;

public class Swapnums {
	// 27) Program to Swap Two Numbers
	
	public static void main(String[] args) {
		System.out.println("Swapping Two Numbers !!! \n");
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the First Number : ");
		int a = obj.nextInt();
		
		System.out.println("Enter the Second Number : ");
		int b = obj.nextInt();
		
		System.out.println("Numbers before Swapping \na : "+a+"\nb : "+b);
		int temp ;
		temp = a ;
		a = b ;
		b = temp ;
		
		System.out.println("Numbers after Swapping \na : "+a+"\nb : "+b);
		
	}

}
