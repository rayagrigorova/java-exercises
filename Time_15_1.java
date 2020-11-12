package OOP;
import java.util.*;
public class Time_15_1 {
	//Design a class named Time . The class contains: The data fields hour , minute
	//,and second that represent a time.
	private int hour;
	private int minute;
	private int second;
	
	
	//A no-arg constructor that creates a Time
	// object for the current time. (The values of the data fields will represent
	// the current time.)
	Time_15_1(){
		long current = System.currentTimeMillis();
		setTime(current);
	}
	
	// constructor that constructs a Time object with a
	// specified elapsed time since midnight, January 1, 1970, in milliseconds. (The
	// values of the data fields will represent this time.)
	Time_15_1(long ms){
		/* long current = System.currentTimeMillis(); */
		 setTime(ms);
	}
	
	//A constructor that
	//constructs a Time object with the specified hour, minute, and second.
	
	Time_15_1(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	

	 /*
	 * Draw the UML diagram for the class then implement the class. Write a test
	 * program that creates three Time objects (using new Time() , new
	 * Time(555550000) , and new Time(5, 23, 55) ) and displays their hour, minute,
	 * and second in the format hour:minute:second. (Hint: The first two
	 * constructors will extract the hour, minute, and second from the elapsed time.
	 * For the no-arg constructor, the current time can be obtained using
	 * System.currentTimeMillis())
	 */

		
	 //Three getter methods for the data fields hour , minute , and second , respectively.
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	// A method named setTime(long elapseTime) that sets a new time for the object
	// using the elapsed time. For example, if the elapsed time is 555550000
	// milliseconds, the hour is 10 , the minute is 19 , and the second is 10 .
	 public void setTime(long elapseTime){
		 setHour((int)(elapseTime / (1000 * 60 * 60) ) % 24);
		 setMinute((int)(elapseTime / (1000 * 60)) % 60);
		 setSecond((int)(elapseTime / 1000) % 60);
	 }

}
