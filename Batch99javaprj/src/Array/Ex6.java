package Array;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number of row");
		int row  = sc.nextInt();
		System.out.println("Enter number of coloum");
		int coloum = sc.nextInt();
		
		int A[][]= new int[row][coloum];
		
		for (int i = 0; i < row; i++) {
		   for (int j = 0; j < coloum; j++) {
			System.out.println("Enter a value: ");
			A[i][j]= sc.nextInt();		   
		   }
		
		}
		System.out.println("Show Data of array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}

}
