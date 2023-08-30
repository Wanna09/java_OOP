package OOPAbstract;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary sa = new Salary("Mg Mg","Gyaung gyo Gyaung Gyar", 3, 1000);
		Employee em = new Salary("Ma Ma", "Bahan", 4, 10000);
		System.out.println(sa.computePay());
		System.out.println(em.computePay());
	}

}
