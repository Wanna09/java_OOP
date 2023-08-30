package SearchingandSofting;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c;
		do {
			Scanner sc = new Scanner(System.in);
			ElectronicSystem ele = new ElectronicSystem();
			ele.WelcomePage();
			System.out.println("Do you want to try again? Type Yes or No?");
			 c = sc.next();
		} while (c.equalsIgnoreCase("Yes"));
		System.out.println("System Ended");
		
		

	}

}
