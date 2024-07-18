package javaexercises1;

import java.util.Scanner;

public class Posneg {
	//32) Program to Check Whether a Number is Positive or Negative
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num  = obj.nextInt();
		
		if(num>=0) {
			System.out.println("The number "+num+ " is positive");
		}else {
			System.out.println("The number "+num+ " is negative");
		}
		
	}

}
