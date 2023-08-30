package Revision;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		char b = 'y';
		
		do {
		System.out.println("Enter first value");
		int v = sc.nextInt();
		System.out.println("Enter second value");
		int c = sc.nextInt();
		
		int sum = v + c;
		int sub = v - c;
		int multi = v * c;
		int div = v / c;
		
		System.out.println("Enter condition");
		String con =sc.next();sc.nextLine();
		switch (con) {
		case "+":{
			System.out.println("The answer of sum is " + sum);
		}break;
		case "-":{
			System.out.println("The answer of sub is "+ sub);
		}break;
		case "*":{
			System.out.println("The snswer of multi is "+ multi);
		}break;
		case "/":{
			System.out.println("The answer of div is "+ div);
		}break;
		default:
			System.out.println("Wrong condition");

		}
		System.out.println();
		
		System.out.println("Do  want to do again ? Enter y or n");
		b = sc.next().charAt(0);
		} while (b=='y');
		
		System.out.println();
		System.out.println("Ended");
	}
}

