package SearchingandSofting;

import java.util.Scanner;

public class LinearsearchEg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of element : ");
		int n = sc.nextInt();
		
		
		int []A = new int[n];
		for (int i = 0; i < A.length; i++) {
			System.out.println("Enter a value :");
			A[i] = sc.nextInt();
		}
		
		System.out.println("Enter search key ");
		int key = sc.nextInt();
		
		linearSearch(A , key);
	}
	public static void linearSearch(int[]A, int key) {
		int c;
		for ( c = 0; c < A.length; c++) {
			if (key == A[c]) {
				System.out.println(key + " is found at index "+ c);
				break;
			}
		}
		if ( c == A.length)
			System.out.println(key + " is not found");
	}

}
