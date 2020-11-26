package OOP;

public class TimeTest_15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time_15_1 t1 = new Time_15_1();
		Time_15_1 t2 = new Time_15_1(555550000);
		Time_15_1 t3 = new Time_15_1(5, 23, 55);
		
		System.out.println("t1: hour: " + t1.getHour() + "  minute: " 
						  + t1.getMinute() + "  second: " + t1.getSecond());
		System.out.println("t2: hour: " + t2.getHour() + "  minute: " 
				  + t2.getMinute() + "  second: " + t2.getSecond());
		System.out.println("t3: hour: " + t3.getHour() + "  minute: " 
				  + t3.getMinute() + "  second: " + t3.getSecond());
	}

}
