package OOP;

import java.text.SimpleDateFormat;
import java.util.*;

public class ÀÒÌ_16_1 {

	private int id;
	private double balance;
	private static double yearInterestRate;
	private Date dateCreated = new Date();
	
	ÀÒÌ_16_1(){
		id = 0;
		balance = 0;
		yearInterestRate = 0;
	}

	ÀÒÌ_16_1(int id, double balance){
		if(id >= 0) {
			this.id = id;
			this.balance = balance;
		}
	}
	
	public int getID() {return id;}
	public double getBalance() {return balance;}
	public static double getYearInterestRate(){return yearInterestRate;}
	public Date getDateCreated() {return dateCreated;}
	
	public void setID(int id) {if(id >= 0) this.id = id;}
	public void setBalance(double balance) {this.balance = balance;}
	
	public static void setYearInterestRate(double yearInterestRate) {
		if(yearInterestRate > 0) {
			ÀÒÌ_16_1.yearInterestRate = yearInterestRate; 
		}
		else {
			System.out.println("Invalid interest rate");
		}
	}
	
	public static double getMonthlyInterestRate (){
		return ÀÒÌ_16_1.yearInterestRate / 12;
	}
	
	public double getMonthlyInterest (){
		double temp = ÀÒÌ_16_1.getMonthlyInterestRate ();
		return balance * temp;
	}
	
	public void withdraw(double s){
		if(s > 0 && balance >= s) {
			balance -= s;
		}
		else {
			System.out.println("The sum you tried to withdraw is too high or invalid");
		}
		return;
	}
	
	public void deposit(double s){
		if(s > 0) {
			balance += s;
		}
		else {
			System.out.println("The sum you tried to deposit is invalid");
		}
		return;
	}
}
