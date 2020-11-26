package OOP;

import java.util.Scanner;

public class ATM_Test_16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		АТМ_16_1 array [] = new АТМ_16_1 [10];
		
		for(int i = 0; i < 10; i++) {
			array[i] = new АТМ_16_1(i, 100);
		}
		
		while(true) {
			System.out.println("Please enter an id");
			int id = sc.nextInt();
			
			while(id < 0 || id > 9) {
				System.out.println("The id you have entered is invalid. Please enter it again.");
				id = sc.nextInt();
			}
			
			int choice;
			
			do {
				System.out.println("Enter: 1 - view balance, 2 - withdraw, 3 - deposit, 4 - exit main menu");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1 :
					System.out.println("Current balance: " + array[id].getBalance());
					break;
					
				case 2: 
					System.out.println("Enter the sum you wish to withdraw.");
					array[id].withdraw(sc.nextDouble());
					break;
					
				case 3:
					System.out.println("Enter the sum you wish to deposit");
					array[id].deposit(sc.nextDouble());
					break;
					
				case 4: 
					System.out.println("Exiting menu");
					break;
				
				default : System.out.println("Invalid command.");
				}
			}
			while(choice != 4);
		}
	}

}
