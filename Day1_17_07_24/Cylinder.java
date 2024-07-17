package javaexercises1;

import java.util.Scanner;

public class Cylinder {
	// 15) Write a program to find the area of the cylinder
	public static void main(String[] args) {
	Scanner obj = new Scanner(System.in) ;
	
	System.out.println("Enter the Radius of Cylinder : ");
	double radius = obj.nextDouble();
	System.out.println("Enter the Height of Cylinder : ") ;
	double height = obj.nextDouble();
	
	double Area = 2 * 3.14 * radius * (radius + height ) ;
	System.out.println("Area of Cylinder : " + Area ) ;
	}
}
