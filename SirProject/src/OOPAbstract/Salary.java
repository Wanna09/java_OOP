package OOPAbstract;

public class Salary extends Employee{

	double salary;
	
	public Salary(String name, String address, int number, double salary){
		super(name, address, number);
//		this.salary = salary;
		setSalary(salary);
	}
	
	
	public void setSalary (double salary) {
		if(salary >= 0.0) {
			this.salary = salary;
		}
		
	}
	
	public double getSalary() {
		return this.salary;
		
	}
	@Override
	public double computePay() {
		// TODO Auto-generated method stub
		System.out.println("Employee name: "+getName());
		double result = salary / 52;
		return result;
		
	}
		
	

}
