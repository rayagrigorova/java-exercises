package OOP;

public class MyInteger_15_3 {
	
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
		if (this.getValue() % 2 == 0) return true;
		return false;
	}
	
	public boolean isOdd() {
		if(!isEven()) return true;
		return false;
	}
	
	public boolean isPrime() {
		for(int i = 2; i <= this.getValue() / 2; i++) {
			if(this.getValue() % i ==0) return false;
		}
		return true;
	}
	
//	The static methods isEven(int) , isOdd(int) , and isPrime(int) that
//	return true if the specified value is even, odd, or prime, respectively.
	public static boolean isEven(int a) {
		if (a % 2 == 0) return true;
		return false;
	}
	
	public static boolean isOdd(int a) {
		if(!isEven(a)) return true;
		return false;
	}
	
	public static boolean isPrime(int a) {
		for(int i = 2; i <= a / 2; i++) {
			if(a % i ==0) return false;
		}
		return true;
	}
	
			
//	The static methods isEven(MyInteger) , isOdd(MyInteger) , and
//	isPrime(MyInteger) that return true if the specified value is even, odd,
//	or prime, respectively.

	public static boolean isEven(MyInteger_15_3 a) {
		if (a.getValue() % 2 == 0) return true;
		return false;
	}
	
	public static boolean isOdd(MyInteger_15_3 a) {
		if(!isEven(a)) return true;
		return false;
	}
	
	public static boolean isPrime(MyInteger_15_3 a) {
		for(int i = 2; i <= a.getValue() / 2; i++) {
			if(a.getValue() % i ==0) return false;
		}
		return true;
	}
	
//	The methods equals(int) and equals(MyInteger) that return true if
//			the value in this object is equal to the specified value
	
	public boolean equals (int a) {
		if(this.getValue() == a) return true;
		return false;
	}
	public boolean equals(MyInteger_15_3 a) {
		if(this.getValue() == a.getValue()) return true;
		return false;
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
		int ans = 0;
		for(int i = 0; i < a.length(); i++) {
			ans = ans * 10 + Character.getNumericValue(a.charAt(i));
		}
		return ans;
	}
}
