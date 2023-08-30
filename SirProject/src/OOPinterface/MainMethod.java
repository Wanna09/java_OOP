package OOPinterface;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle (2.0, 3.0);
		System.out.println("Rectangle - Area: "+r.area());
		System.out.println("Rectangle - perimeter: "+r.perimeter());
		System.out.println();
		
		Circle c = new Circle (12.0);
		System.out.println("Circle - Area: "+c.area());
		System.out.println("Circle - perieter: "+c.perimeter());
		System.out.println();
		
		
		Triangle tri = new Triangle(7,12,13);
		System.out.println("Triangle - Area: "+tri.area());
		System.out.println("Triangle - Perimeter: "+tri.perimeter());
	}

}
