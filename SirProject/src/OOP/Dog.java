package OOP;

public class Dog {
	
	class Animal{
		String color = "white";
		Animal(){
			System.out.println("animal is created");
		}
		public void display() {
			System.out.println("display method of animal class");
		}
	}
	
	
	class Dogs extends Animal{
		String color  = "black";
		public Dogs(){
			super();
			System.out.println("Dog is created");
		}
		public void display() {
			System.out.println("display method of Dog class");
		}
		
		public void printColor() {
			System.out.println(color);
			System.out.println(super.color);
			
			display();
			
			super.display();
		}
	}
	
	class TestSuper{
		public static void main (String args[]) {
			Dog zz=new Dog();
			zz.printColor();
		}
}

	public void printColor() {
		// TODO Auto-generated method stub
		Dogs dd = new Dogs();
		dd.printColor();
		

		
	}
}
	

	
