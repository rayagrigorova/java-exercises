package OOP;

public class BMI_15_2 {
	private String name;
	private int age;
	private double weight; //in pounds
	private double height; //in inches
	
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	public static final double METERS_PER_FEET = 0.3048;
	
	BMI_15_2(){
		setName("");
		setAge(-1);
		weight = -1;
		height = -1;
	}
	
	BMI_15_2(String name, int age, double height, double weight){
		this.setName(name);
		this.setAge(age);
		this.height = height;
		this.weight = weight;
	}
	
	BMI_15_2(String name, double height, double weight){
		this(name,20,height,weight);
	}
	
	BMI_15_2 (String name, int age, double feet,
			double inches, double weight ) {
		this(name, age, (12 * feet) + inches, weight );
	}

	
	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND/
				(Math.pow((height * METERS_PER_INCH),2));
		return Math.round (bmi*100) / 100.0;
	}
	
	public String getStatus() {
		double bmi = getBMI();
		
		if(bmi <= 18.5) {
			return "Underweight";
		}
		else if(bmi < 25) {
			return "Normal";
		}
		else if (bmi < 30) {
			return "Overweight";
		}
		else 
			return "Obese";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//
	
}
