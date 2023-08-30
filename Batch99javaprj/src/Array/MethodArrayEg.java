 package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MethodArrayEg {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] A = new int[5];
		
		input(A, A.length);
		display(A);
		System.out.println("Maxminum value : "+ maxValue(A , 5));
		System.out.println("Maxminum value : "+ minValue(A , 5));
		

	}
	
	public static void input(int[]a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Enter value : ");
			a[i] = sc.nextInt();
		}
	}
	
	public static void display(int[] a) {
		for (int i : a) {
			System.out.println(i +" ");
		}
	}
	
	public static int maxValue(int[] a, int n) {
		Arrays.sort(a);
		return a[a.length-1];
	}
	public static int minValue(int[] a, int n) {
		Arrays.sort(a);
		return a[0];
	}

	
	
	}

