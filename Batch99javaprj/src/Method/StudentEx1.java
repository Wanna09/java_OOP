package Method;

public class StudentEx1 {
	
	String name;
	int age;
	static String module = "Unit1 Programning";
	
	public void createstudent() {
		System.out.println("Create Student object = " + name + " " + age);
	}
	
	public static void display() {
		System.out.println(module);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEx1 st1 = new StudentEx1();
		st1.name = "Kyaw Gyi";
		st1.age = 30;
		st1.createstudent();
		
		StudentEx1 st2 = new StudentEx1();
		st2.name = "Kyaw g";
		st2.age = 70;
		st2.createstudent();
		
		System.out.println(StudentEx1.module);
		StudentEx1.display();
		
		
		
		

	}

}
