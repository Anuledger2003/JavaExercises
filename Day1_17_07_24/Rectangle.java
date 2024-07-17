package javaexercises1;

import java.util.Scanner;

public class Rectangle {
	//14) Write a program to find the area of the rectangle
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Length of Rectangle : ") ;
		double length = obj.nextDouble();
		System.out.println("Enter the Breath of Rectangle : ") ;
		double breath = obj.nextDouble();
		
		double Area = length * breath ;
		
		System.out.println("The Area of Rectangle : "+Area);
		
	}

}
