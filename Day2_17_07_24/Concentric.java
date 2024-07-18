package javaexercises1;

import java.util.Scanner;

public class Concentric {
	// 17) Given the radius of two concentric circle, find the area of the space between the circles.
	
	public static void main(String[] args) {
		
		 double pi = 3.1415926536;
		 
		 Scanner obj = new Scanner(System.in);
		 
		 System.out.println("Enter the radius of Outer Circle : ");
		 int outer = obj.nextInt();
		 
		 System.out.println("Enter the radius of Inner Circle : ");
		 int inner = obj.nextInt();
		 
		 double outerval = outer * outer * pi ;
		 
		 double innerval = inner * inner * pi ;
		 
		 double area = outerval - innerval ;
		 
		 System.out.println("the Area of the Space between the Circles : "+ area);
		 
	}

}
