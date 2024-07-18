package javaexercises1;

public class Statickeyword {
	//8) Write a program to demonstrate the functionalities of static keyword.
	
	static int num = 9 ; // static instance variable
	
	// static block , we can reassign the static instance value .
	static {
		
		num = 10 ; // value reassigned .
	}
	
	int y = 7 ; // non-static instance variable
	
	
	
	/*Static member is directly accessed by static method .
	 * Non - static member can't be accessed directly in static method , It will only accessed through object or class reference .
	 * Both static and non-satic members are accessed by non - static method .
	*/
	public static void main(String[] args) {
		Statickeyword m = new Statickeyword() ; 
		System.out.println("x :" +num) ; 
		System.out.println("y :" +m.y);	
		First();
	}
	
	static void First(){
		Statickeyword n = new Statickeyword() ; 
		System.out.println("FIRST");
		n.Second();
	}
	
	void Second() {
		Third();
		System.out.println("SECOND");
	}

	static int Third(){
		System.out.println("THIRD");
		return 6 ;
	}
	
}
