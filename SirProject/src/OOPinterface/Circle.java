package OOPinterface;

public class Circle implements Shape{
	
	private double radius;
	
	public Circle (double radius) {
		this.radius  = radius;
	}
	
	public double area() {
		return Math.PI * radius *radius;
	}
	
	public double perimeter () {
		return 2.0 * Math.PI * radius;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
