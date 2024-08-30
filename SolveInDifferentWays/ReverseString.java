package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s =sc.nextLine();
		String rev = "";
		
		/*
		 * // Using CharAt() Method ... 
		 * int len = s.length();
		 * 
		 * for( int i = len-1 ; i >= 0 ; i --) { 
		 * 		rev = rev + s.charAt(i); 
		 * }
		 */
		
		/*
		 * // Using CharArray
		 * 
		 * char[] a = s.toCharArray();
		 * 
		 * int len = a.length;
		 * 
		 * for(int i = len-1 ; i>=0 ; i--) {
		 * 
		 * rev = rev + a[i];
		 * 
		 * } 
		 */
        
		/*
		 * // Using String Buffer
		 * 
		 * StringBuffer sb = new StringBuffer(s); 
		 * StringBuffer reverse = sb.reverse();
		 */
		
		/*
		 * // Use CharArray (2)
		 * 
		 * char[] a = s.toCharArray(); 
		 * int left = 0 ; 
		 * int right = a.length - 1;
		 * 
		 * while(left < right) {
		 * 
		 * char temp = a[left]; 
		 * a[left] = a[right]; 
		 * a[right] = temp;
		 * 
		 * left++; 
		 * right--;
		 * 
		 * } 
		 * String st = new String(a);
		 * 
		 * System.out.println("The Reverse String : "+ st);
		 */
		
		System.out.println("The Reverse String : "+ reverse(s));
	}
	
	/*
	 * //Using Recursive Function
	 * 
	 * static String reverse(String s) {
	 * 
	 * 		if(s.isEmpty()) { 
	 * 			return s; 
	 * 		} 
	 * 		return reverse(s.substring(1)) + s.charAt(0) ;
	 * }
	 */
	
}
