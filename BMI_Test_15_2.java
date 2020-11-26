package OOP;

public class BMI_Test_15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMI_15_2 p1 = new BMI_15_2 ("Ivan", 75, 70, 100);
		BMI_15_2 p2 = new BMI_15_2 ("Georgi", 45, 6, 4, 180);
		BMI_15_2 p3 = new BMI_15_2 ("Stoyan", 65, 200);
		
		BMI_15_2 p4 = new BMI_15_2 ("Ivan", 75, 60, 100);
		BMI_15_2 p5 = new BMI_15_2 ("Georgi", 45, 5, 10, 170);
		BMI_15_2 p6 = new BMI_15_2 ("Stoyan", 78, 200);
		
		System.out.println(p1.getBMI() + " " + p2.getBMI() + " " + p3.getBMI()
						+ "\n" + p4.getBMI() + " " + p5.getBMI() + " " + p6.getBMI());
	}
//
}
