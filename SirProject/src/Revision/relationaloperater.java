package Revision;

import java.util.Scanner;

public class relationaloperater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		
			System.out.println("Enter username");
			String username = sc.nextLine();
			System.out.println("Enter password");
			String password = sc.nextLine();
			if (username.equals("Min Min")&& password.equals("123")) 
			{
				System.out.println("Correct username and password");
			}
			else
			{
				System.out.println("Wrong");
			}
			
	}
	}


