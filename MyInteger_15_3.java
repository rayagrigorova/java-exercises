package OOP;

public class MyInteger_15_3 {
//	Design a class named MyInteger . The class contains:
//		An int data field named value that stores the int value represented by
//		this object.
//		A constructor that creates a MyInteger object for the specified int value.
//		A getter method that returns the int value.
//		The methods isEven() , isOdd() , and isPrime() that return true if the
//		value in this object is even, odd, or prime, respectively.
//		The static methods isEven(int) , isOdd(int) , and isPrime(int) that
//		return true if the specified value is even, odd, or prime, respectively.
//		The static methods isEven(MyInteger) , isOdd(MyInteger) , and
//		isPrime(MyInteger) that return true if the specified value is even, odd,
//		or prime, respectively.
//		The methods equals(int) and equals(MyInteger) that return true if
//		the value in this object is equal to the specified value.
//		A static method parseInt(char[]) that converts an array of numeric
//		characters to an int value.
//		A static method parseInt(String) that converts a string into an int value.
	
	private int value;
	
	public MyInteger_15_3(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	
//	The methods isEven() , isOdd() , and isPrime() that return true if the
//			value in this object is even, odd, or prime, respectively.

	public boolean isEven() {
		return (isEven(this.getValue()));
	}
	
	public boolean isOdd() {
		return(isOdd(this.getValue()));
	}
	
	public boolean isPrime() {
		return (isPrime(this.getValue()));
	}
	
//	The static methods isEven(int) , isOdd(int) , and isPrime(int) that
//	return true if the specified value is even, odd, or prime, respectively.
	public static boolean isEven(int a) {
		return (a % 2 == 0);
	}
	
	public static boolean isOdd(int a) {
		return(!isEven(a));
	}
	
	public static boolean isPrime(int a) {
		for(int i = 2; i <= a / 2; i++) {
			if(a % i == 0) return false;
		}
		return true;
	}
	
			
//	The static methods isEven(MyInteger) , isOdd(MyInteger) , and
//	isPrime(MyInteger) that return true if the specified value is even, odd,
//	or prime, respectively.

	public static boolean isEven(MyInteger_15_3 a) {
		return(isEven(a.getValue()));
	}
	
	public static boolean isOdd(MyInteger_15_3 a) {
		return(isOdd(a.getValue()));
	}
	
	public static boolean isPrime(MyInteger_15_3 a) {
		return(isPrime(a.getValue()));
	}
	
//	The methods equals(int) and equals(MyInteger) that return true if
//			the value in this object is equal to the specified value
	
	public boolean equals (int a) {
		return(this.getValue() == a);
	}
	public boolean equals(MyInteger_15_3 a) {
		return(this.equals(a.getValue()));
	}

	
//	A static method parseInt(char[]) that converts an array of numeric
//	characters to an int value.
	
	public static int parseInt(char[] a) {
		int ans = 0;
		for(int i = 0; i < a.length; i++) {
			ans = ans * 10 + Character.getNumericValue(a[i]);
		}
		return ans;
	}
	
	public static int parseInt(String a) {
		return parseInt(a.toCharArray());
	}
}
