package SampleProgram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		double base = sc .nextInt();
		System.out.println("Enter height");
		double height = sc. nextInt();
		double area = 0.5 *  base * height;
		System.out.println("Area of triangle = " + area);
	}

}
