package OOP;

public class MyPoint_15_4 {
//	The data fields x and y that represent the coordinates with getter methods.
	private double x;
	private double y;
	
//	A no-arg constructor that creates a point ( 0 , 0 ).
	public MyPoint_15_4(){
		setX(0);
		setY(0);
	}
//	A constructor that constructs a point with specified coordinates.
	public MyPoint_15_4(double x, double y){
		this.setX(x);
		this.setY(y);
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
//	A method named distance that returns the distance from this point to a
//	specified point of the MyPoint type.
	
//The distance is sqrt((xA − xB)^2 + (yA − yB)^2)
	public double distance (MyPoint_15_4 a) {
		return Math.sqrt(Math.pow(a.getX() - this.getX(),2) + Math.pow(a.getY() - this.getY(),2));
	}
	
//	A method named distance that returns the distance from this point to
//	another point with specified x - and y -coordinates.
	
	public double distance (int x, int y) {
		return Math.sqrt(Math.pow(x - this.getX(), 2) + Math.pow(y - this.getY(), 2));
	}
	
//	A static method named distance that returns the distance from two MyPoint
//	objects.
	public static double distance(MyPoint_15_4 a, MyPoint_15_4 b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}
}
