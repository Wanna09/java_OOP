package OOP;

public class Person {
	String name;
	int age;
	public Person() {
		 name = "Aung Aung";
		 age = 30;
	}
	public Person(String Name, int Age) {
		this.name = Name;
		this.age = Age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ps1 = new Person();
		System.out.println(ps1.name + " is " + ps1.age + " years old.");
		Person ps2 = new Person("Maung Maung", 20);
		System.out.println(ps2.name + " is " + ps2.age + " years old.");
		

	}

}
