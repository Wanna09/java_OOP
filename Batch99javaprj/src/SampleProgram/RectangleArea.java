package SampleProgram;

import java.util.Scanner;

abstract class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		double length = sc.nextDouble();
		System.out.println("Enter width");
		double width=sc.nextDouble();
		double area= length* width;
		System.out.println("Area of rectangle = " + area);

	}

}
