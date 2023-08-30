package OOP;

public class student {
	public  student()
	{
		System.out.println("Student Constructors");
	}
	public student(String name)
	{
		System.out.println("Name is "+ name);
	}
	public student(int age)
	{
		System.out.println("Name is "+ age);
	}

	public static void main(String[] args) {
		student st = new student("Zaw Zaw");
		student st1 = new student();
		student st2 = new student(88);
		student st3 = new student("Maung Maung");
		

	}

}
