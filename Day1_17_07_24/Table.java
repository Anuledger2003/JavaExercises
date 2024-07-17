package javaexercises1;

import java.util.Scanner;

public class Table {
	//1) Write a single program to generate a multiplicaiton and subtraction table for a given number.
	public static void main(String[] args) {
	System.out.println("Enter the table value you want : ");
	Scanner obj = new Scanner(System.in);
	int num = obj.nextInt();
	System.out.println("The Multiplication table for \n");
	for (int i = 0 ; i<=10 ; i++) {
		int multableval = num * i ;
		System.out.println(num +" * "+i+" is "+multableval);
	}
	System.out.println("The Subtraction table for \n");
	for (int j = 0 ; j<=10 ; j++) {
		int subtableval = num - j ;
		System.out.println(num +" - "+j+" is "+subtableval);
	}
	}

}
