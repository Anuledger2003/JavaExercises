package FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class CountOddEven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		int ec = 0;
		int oc = 0;
		
//		while( n > 0) {
//			
//			int rem = n % 10;
//			if(rem %2 == 0) {
//				ec++ ;
//			}
//			else {
//				oc++;
//			}
//			n = n/10;	
//		}
		
		

//		while( n > 0) {
//			int d = n&1;
//			if(d == 0) {
//				ec++;
//			}
//			else {
//				oc++;
//			}
//			n =n/10;
//		}
		
		System.out.println("The Even Count : "+ec+"\n"+"The Odd Count  : "+oc);
		
	}

}
