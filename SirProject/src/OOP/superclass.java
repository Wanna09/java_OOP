package OOP;

public class superclass {
	
	int num  = 20;
	public void display() {
		System.out.println("This is the display method of superclass");
	}
}
	
	 class Subclass extends superclass {
		int num = 10;
		
	public void display() {
		System.out.println("This is the display method of subclass");
	}
	public void my_method() {
		Subclass sub  = new Subclass();
		
		sub.display();
		
		super.display();
		
		System.out.println("vlaue of the variable named num in sub class: "+sub.num);
		
		System.out.println("vlaue of the variable named num in superclass class: "+super.num);
}
	
	
	public static void main(String[] args) {
		
		Subclass obj = new Subclass();
		obj.my_method();

	}
	
	
}


