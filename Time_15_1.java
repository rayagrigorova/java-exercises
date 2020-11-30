package OOP;
import java.util.*;
public class Time_15_1 {
	private int hour;
	private int minute;
	private int second;

	Time_15_1(){
		this(System.currentTimeMillis());
	}
	
	Time_15_1(long ms){
		 setTime(ms);
	}
	
	Time_15_1(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
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
	
	public void setTime(long elapseTime){
		setHour((int)(elapseTime / (1000 * 60 * 60) ) % 24);
		setMinute((int)(elapseTime / (1000 * 60)) % 60);
		setSecond((int)(elapseTime / 1000) % 60);
	}

}

