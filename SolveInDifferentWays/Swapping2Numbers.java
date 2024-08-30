package FrequentlyAskedJavaProgram;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a = 5 ;
		int b = 10 ;
		
		System.out.println("Before Swapping a = "+ a+  "   b = "+ b);
		
		/*
		 * Logic 1 
		 * Use Temporary Variables
		 * 
		 * int temp = a ;  temp = 10
		 * a = b ;            a = 20
		 * b = temp ; 		  b = 10
		 * System.out.println("After  Swapping a = "+ a + "   b = "+ b);
		 */
		
		
		/*
		 * Logic 2 
		 * Arithmetic Operations + and -
		 * 
		 * a = a+b;     a = 30
		 * b = a-b; 	b = 10
		 * a = a-b ;    a = 20
		 * System.out.println("After  Swapping a = "+ a + "   b = "+ b);
		 * 
		 */
		
		/*
		 * Logic 3 
		 * Arithmeic Operations / and *
		 * 
		 * a = a*b; 	a = 200 
		 * b = a / b;   b = 200 /20 = 10 
		 * a = a / b;   a = 200 /10 = 20
		 * System.out.println("After  Swapping a = "+ a + "   b = "+ b);
		 */
		 
		
		/*
		 * Logic 4 
		 * XOR Operations
		 * 
		 * a = a^b ; // 30 
		 * b = a^b ; // 10 
		 * a = a^b ; // 20
		 * System.out.println("After  Swapping a = "+ a + "   b = "+ b);
		 * 
		 * 
		 * // How ? 
		 * // a = 10 = 0000 1010 
		 * // b = 20 = 0001 0100 
		 * // a = a^b= 0001 1110 // 16+8+4+2 = 30
		 * 
		 * // b = a^b= 0000 1010 // 8+2 = 10 
		 * // a = 30 = 0001 1110 
		 * // b = 20 = 0001 0100
		 * 
		 * // a = a^b= 0001 0100 // 16+4 = 20 // 
		 * a = 30 = 0001 1110 // 
		 * b = 10 = 0000 1010
		 */	
		
	    
		/*
		 * Logic 5 
		 * Single Statement
		 * 
		 * a = a+b -(b = a); 
		 * b = a+b -(a = b );
		 * System.out.println("After  Swapping a = "+ a + "   b = "+ b);
		 */
		
		
	}  
	
}
