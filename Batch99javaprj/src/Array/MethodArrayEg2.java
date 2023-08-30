package Array;

import java.util.Scanner;

public class MethodArrayEg2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[5];
		
		
		input(A, A.length);
		display(A);
		
		int index = maxValue(A, A.length);
		System.out.println("\nlarger element is "+ A[index] +" at index "+ index);
		
		int index2 = minValue(A, A.length);
		System.out.println("\nSmaller element is "+ A[index2] +" at index "+ index2);
	
	}
	
	public static void display(int[] a) {
		for (int i : a) {
			System.out.println(i +" ");
		}
	}
	public static void input(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Enter value: ");
			a[i] = sc.nextInt();
		}
	}
	
	public static int maxValue(int[]a,int n) {
	    int max=a[0];
	    int index=0;
	    for (int i = 1; i < a.length; i++) {
	      if (a[i]>max) {
	        max=a[i];
	        index=i;
	      }
	    }
	    return index;
	  }
	public static int minValue(int[]a,int n) {
	    int min=a[0];
	    int index=0;
	    for (int i = 1; i < a.length; i++) {
	      if (a[i]<min) {
	        min=a[i];
	        index=i;
	      }
	    }
	    return index;
	  }
}

