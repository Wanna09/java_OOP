package SampleProgram;

import java.util.Scanner;

public class RightTriangleProve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		double base = sc.nextDouble();
		System.out.println("Enter height");
		double height = sc.nextDouble();
		System.out.println("Enter hypotenuse");
		double hyp = sc.nextDouble();
		if (hyp*hyp == base*base+height*height) {
			System.out.println("right triangle");
		}
		else {
			System.out.println("not right triangle");
		}
		

	}

}
