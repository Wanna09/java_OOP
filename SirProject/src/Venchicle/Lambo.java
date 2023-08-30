package Venchicle;

public class Lambo extends Car{

	public static void main(String[] args) {
		Lambo lam = new Lambo();
		lam.ViewgetName();
	}
	
	public void ViewgetName() {
		super.getName("Mg Mg", 18);
	}

}
