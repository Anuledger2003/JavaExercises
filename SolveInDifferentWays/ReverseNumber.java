package FrequentlyAskedJavaProgram;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		
		/*
		 * // Use Algorithms which has % and /
		 * 
		 * int rev = 0;
		 * 
		 * while(num != 0) {
		 * 
		 * rev = rev * 10 + num % 10 ; 
		 * num = num / 10 ;
		 * 
		 * }
		 */
		
		/*
		 * // Use StringBuffer Class
		 * 
		 * StringBuffer sb = new StringBuffer(String.valueOf(num)); 
		 * StringBuffer rev = sb.reverse();
		 */
		
		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * StringBuilder rev = sb.append(num).reverse();
		 */
		

//		int rev = reverseNumber(num);
//		System.out.println("Reverse Number : " + rev);
			
		}
		
		// 	Using Recursion ... 
	 
		/*
		 * static int reverseNumber(int num) { 
		 * 		if (num < 10) { 
		 * 			return num; 
		 * 		} 
		 * 		return Integer.parseInt("" + num % 10 + reverseNumber(num / 10)); 
		 * }
		 */

}
