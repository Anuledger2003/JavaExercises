package javaexercises1;

import java.util.Scanner;

public class Vowelsorconsonant {
	// 29) Program to Check Whether a Character is a Vowel or Consonant
	public static void main(String[] args) {
		System.out.println("Let's Find Given Char is Vowel or Consonant !!!");
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the Alphabet : ");
		char value = obj.next().charAt(0);
	    
		if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A' || value == 'E' || value == 'I' || value == 'O' || value == 'U') {
			System.out.println("The Alphabet "+value+" is Vowel ");
		}
		else {
			System.out.println("The Alphabet "+value+" is Consonant ");
		}
	}
}
