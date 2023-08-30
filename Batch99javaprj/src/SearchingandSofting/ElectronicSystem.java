package SearchingandSofting;

import java.util.Scanner;

public class ElectronicSystem {
	static Scanner sc = new Scanner(System.in);
	static Item[]I;
	
	public ElectronicSystem() {
		 I = new Item[5];
		
		Item i1 = new Item("TV",80000.00,20);
		Item i2 = new Item("Phone",90000.00,10);
		Item i3 = new Item("Headphone",70000.00,30);
		Item i4 = new Item("Microwave",50000.00,5);
		Item i5 = new Item("Iron",100000.00,7);
		
		
		I[0] = i1;
		I[1] = i2;
		I[2] = i3;
		I[3] = i4;
		I[4] = i5;
		
		
	}
	
	public void WelcomePage() {
		System.out.println("Welcome Electronic System");
		System.out.println("1. View Sell item List");
		System.out.println("2. Search item list by item name: ");
		System.out.println("Choose Option: ");
		int option = sc.nextInt();
		
		switch (option) {
		case 1: ViewSellItem(); break;
		case 2: SearchItem(); break;
		default : {
			System.out.println("Wrong Input");
			WelcomePage();
		}
		
		}
	}
	public void ViewSellItem() {
		System.out.println("ItemName  Price  Quantity");
		for ( Item i : I ) {
			System.out.println(i.getItemName()+" "+ i.getPrice()+" "+i.getQty());
		}
		
	}
	
	public void SearchItem() {
		sc.nextLine();
		System.out.println("Enter Search Key Item name: ");
		String SIname = sc.nextLine();
		int i;
		for ( i = 0; i < I.length; i++) {
			if(SIname.equalsIgnoreCase(I[i].getItemName())) {
				System.out.println(I[i].getItemName()+"  "+I[i].getPrice()+"  "+I[i].getQty());
				break;
			}
		}
		if ( i == I.length) {
			System.out.println(SIname + "is not found");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
