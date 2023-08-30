package Method;

import java.util.Scanner;

public class Ex2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {
			System.out.print("Enter first number :");
			int fnum = sc.nextInt();
			
			System.out.print("Enter second number :");
			int snum = sc.nextInt();
			
			System.out.print("Enter operator :");
			char op = sc.next().charAt(0);
			int result = 0;
			
			switch ( op ) {
			case '+' : result  = sum(fnum, snum); break;
			case '-' : result  = sub(fnum, snum); break;
			case '*' : result  = multi(fnum, snum); break;
			case '/' : result  = div(fnum, snum); break;
			default : System.out.println("Wrong input");
			}
			System.out.println("Result = "+ result);
		} while (repeat() == true);
		System.out.println("The End");
		
	}
	
	public static boolean repeat() {
		System.out.print("Do another yes/no? : ");
		String status  = sc.next();
		
		if (status.equalsIgnoreCase("yes"))
			return true;
		else return false;
	}
		
		public static int sum(int num1, int num2) {
			return (num1 + num2);
		}
		public static int sub(int num1, int num2) {
			return (num1 - num2);
		}
		public static int multi(int num1, int num2) {
			return (num1 * num2);
		}
		public static int div(int num1, int num2) {
			return (num1 / num2);
		}
		

	}


