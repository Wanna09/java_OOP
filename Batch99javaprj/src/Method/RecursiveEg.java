package Method;

import java.util.Scanner;

public class RecursiveEg {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		
		sum(a, b);

	}
	
	public static void sum(int a, int b) {
		 int c = a + b;
		 System.out.println("C = " + c);
		 if ( c <= 100)
		 System.out.println("Enter another first number: ");
		 int a1 = sc.nextInt();
		 System.out.println("Enter another second number: ");
		 int b1 = sc.nextInt();
		 sum( a1 , b1);
	}

}
