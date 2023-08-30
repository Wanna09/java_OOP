package Method;

import java.util.Scanner;

public class Ex3 {
	static Scanner sc  = new Scanner (System.in);
	static int ft; 
	static float inches;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float ft1 =InputData();
		float ft2 =InputData();
		
		float resultfeet  = add(ft1 , ft2);
		display( resultfeet );
		
	
	}
	public static float InputData() {
		
		System.out.println("Enter feet :");
		 ft = sc.nextInt();
		System.out.println("Enter inches :");
		 inches  = sc.nextFloat();
		
		if( inches >= 12 ) {
			ft++;
			inches -= 12;
		}
		
		float feet = convertfeet();
		return feet;
	}
	
	public static float convertfeet() {
		return ft+(inches/12);	
	}
	public static float add(float ft1, float ft2) {
		return ft1 + ft2;
	}
	public static void display(float resultfeet) {
		System.out.println("Result = "+ resultfeet);
	}
}
