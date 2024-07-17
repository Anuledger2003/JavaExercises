package javaexercises1;

import java.util.Scanner;

public class Bitwiseop {
	// 4) Write a program to define the functionality of a Bitwise operators.
	public static void main (String[] args ) {
	Scanner obj = new Scanner (System.in);
	
	System.out.println("we are going to perform a Bitwise Operations");
	System.out.println("Enter the First Value ") ;
	int a = obj.nextInt();
	System.out.println("Enter the Second Value ") ;
	int b = obj.nextInt();
	
	int unota = ~a;
	int unotb = ~b;
	int andop = a & b ;
	int orop = a | b ;
	int xorop = a ^ b ;
	int rightopa = a >> 2 ;
	int leftopa = a << 2 ;
	int rightopb = b >> 2 ;
	int leftopb = b << 2 ;
    a &= 2 ;
	b |= 2 ;
	
	System.out.println(unota) ;
	System.out.println(unotb) ;
	System.out.println(andop) ;
	System.out.println(orop) ;
	System.out.println(xorop) ;
	System.out.println(rightopa) ;
	System.out.println(leftopa) ;
	System.out.println(rightopb) ;
	System.out.println(leftopb) ;
	System.out.println(a) ;
	System.out.println(b) ;
	
	
	}
}
