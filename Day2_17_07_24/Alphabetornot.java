package javaexercises1;

import java.util.Scanner;

public class Alphabetornot {
	//33) Program to Check Whether a Character is an Alphabet or not - 2
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Character : ");
		char character = obj.next().charAt(0);
		
		int asciival = character ;
		
		if(((asciival>=65)&& (asciival<=90)) || ((asciival>=97)&& (asciival<=122))) {
			
			char answer = (char) asciival ;
			
			System.out.println("This "+answer+" is Alphabet ");
			
		}else {
		
			System.out.println("This is not a  Alphabet ");
			
		}
		
		
	}

}
