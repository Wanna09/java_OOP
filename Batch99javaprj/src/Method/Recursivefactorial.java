package Method;

import java.util.Scanner;

public class Recursivefactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		
		long fact = factorial(num);
		System.out.println("Factorial  = " + fact);

	}
	
	public static long factorial(long num) {
		if (num <= 1)
			return 1;
		else
		 return num * factorial(num - 1);
				
	}

}
