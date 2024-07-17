package javaexercises1;

import java.util.Scanner;

public class Square {
	//13) Write a program to find the area of the square

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the measure of square : ");
	    double a =obj.nextDouble();
		double Area = a * a;
		System.out.println("The Area of Square : " +Area);
	}

}
