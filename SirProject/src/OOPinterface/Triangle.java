package OOPinterface;

public class Triangle implements Shape {
	
	private double a;
	private double b;
	private double c;
	
	public Triangle (double a, double b, double c) {
		this.a  = a;
		this.b  = b;
		this.c  = c;
	}
	
	public double area () {
		double s = (a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public double perimeter () {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
