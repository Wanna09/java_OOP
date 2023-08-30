package OOP;

public class animal {
	public String name;
	public int height;
	private String gender;
	
	public String getgender(String something) {
		gender = something;
		return gender;
	}
	
	public void getanimal() {
		name = "Aung lay";
		height = 4;
	}
	public static void main(String[] args) {
		
		animal dog = new animal();
		System.out.println(dog.name);  // null (as no value is assigned yet)
		dog.getanimal();
		System.out.println(dog.name);
		System.out.println(dog.height);
		dog.getgender("Female");
		System.out.println(dog.gender);
	}

}
