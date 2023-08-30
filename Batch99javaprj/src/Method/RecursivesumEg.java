package Method;

import java.util.Scanner;

public class RecursivesumEg {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter sum number : ");
		int num = sc.nextInt();
		
		
		Sum(num);
		System.out.println("Total = " +Sum(num));

	}
	public static int Sum(int n) {
		if (n==1)
			return 1;
		else return n + Sum(n-1);
	}

}
