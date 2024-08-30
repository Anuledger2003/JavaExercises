package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class CountNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n =sc.nextInt();
		int t= n;
		int count = 0;
		
		while(n > 0) {
			
			n = n/10;
			count++;
			
		}
		System.out.println("Total Numbers are: " + count);
		
		
		String s = String.valueOf(t);
		System.out.println("Total Numbers are: " + s.length());
		
		int c = Counting(t);
		
		System.out.println("Total Numbers are: " + c);
		
	}
	
	static int Counting(int n) {
		if(n == 0) return 0;
		return 1+Counting(n/10);
		
	}

}
