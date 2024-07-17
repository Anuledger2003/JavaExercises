package javaexercises1;

import java.util.Scanner;

public class Quadraricequation {
	// 31) Program to Find the Roots of a Quadratic Equation
		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			System.out.println("Let's do Polynomial Equaion ax^2 + bx + c : ") ;
			
			System.out.println("Enter the value of a : ") ;
			float a = obj.nextFloat();
			System.out.println("Enter the value of b : ") ;
			float b = obj.nextFloat();
			System.out.println("Enter the value of c : ") ;
			float c = obj.nextFloat();
			
			float withinsquare = (b*b) - (4*a*c) ; 
			double root1 = (- b + Math.pow(withinsquare, 0.5)) / (2*a) ;
			double root2 = (- b - Math.pow(withinsquare, 0.5)) / (2*a) ;
			
			if(withinsquare > 0) {
				
				System.out.println("The roos of Given Eqautions \n Root1 : "+root1+"\n Root2 : "+root2) ;
			}
			else {
				System.out.println("Enter the real roots") ;
			}
		}
}
