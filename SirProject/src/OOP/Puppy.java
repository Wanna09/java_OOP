package OOP;

public class Puppy {
	private int PuppyAge;
	public Puppy (String name){
		System.out.println("Name chosen is : "+name);
	}
	
	public void setAge(int age) {
		PuppyAge = age;
	}
	
	public int getAge() {
		return PuppyAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p1 = new Puppy("Maung Maung");
		p1.setAge(13);
		System.out.println(p1.getAge());
	}

}
