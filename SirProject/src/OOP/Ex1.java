package OOP;

import java.util.Scanner;

public class Ex1 {
	String name;
	int age;
	
	public Scanner sc = new Scanner(System.in);
	
	public Ex1() {
		System.out.println("Enter your name");
	    name = sc.nextLine();
		System.out.println("Enter your age");
		age = sc.nextInt();																					
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 ex = new Ex1();
		System.out.println("Your name is "+ ex.name);
		System.out.println("Your age is "+ ex.age);
		

	}

}
