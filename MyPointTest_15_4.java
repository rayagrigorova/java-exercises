package OOP;

public class MyPointTest_15_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint_15_4 p1 = new MyPoint_15_4(2,3);
		MyPoint_15_4 p2 = new MyPoint_15_4(-3,1);
		MyPoint_15_4 p3 = new MyPoint_15_4(4,-2);
		MyPoint_15_4 p4 = new MyPoint_15_4(6,-3);
		
		System.out.println(p1.distance(p2) + " " + p2.distance(p3));
		System.out.println(p1.distance(0,0) + " " + p2.distance(-3,4));
		System.out.println(MyPoint_15_4.distance(p1, p2));
	}

}
