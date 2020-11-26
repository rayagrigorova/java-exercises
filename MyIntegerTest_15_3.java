package OOP;

public class MyIntegerTest_15_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger_15_3 s1 = new MyInteger_15_3 (17);
		MyInteger_15_3 s2 = new MyInteger_15_3 (466);
		char arr[] = {'6','7','8','2','9','5'};
		String str = "123456";
	
		System.out.println(s1.isEven() + " " + s1.isOdd() + " " + s1.isPrime());
		
		System.out.println(MyInteger_15_3.isEven(4) + " " 
		+ MyInteger_15_3.isOdd(66) + " " + MyInteger_15_3.isPrime(18));
		
		System.out.println(MyInteger_15_3.isEven(s2) + " " + MyInteger_15_3.isOdd(s2) + " " + MyInteger_15_3.isPrime(s2));
		
		System.out.println(s1.equals(17) + " " + s1.equals(s2));
		
		System.out.println(MyInteger_15_3.isOdd(MyInteger_15_3.parseInt(arr)));
		System.out.println(MyInteger_15_3.parseInt(arr));
		
		System.out.println(MyInteger_15_3.isOdd(MyInteger_15_3.parseInt(str)));
		System.out.println(MyInteger_15_3.parseInt(str));
		
		//
		
	}

}
