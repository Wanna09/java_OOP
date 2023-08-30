package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter count of temperature");
		int hm = sc.nextInt();
		
		int[]A = new int[hm];
		int sum = 0;
		
		for (int i = 0; i < A.length; i++)
		{
			System.out.println("Enter day " +(i+1)+" temperature");
			A[i]= sc.nextInt();
			sum+=A[i];
		}
		
		int avg = sum/hm;
		System.out.println("Average temperature = " + avg);
		
		System.out.println();
		
		int v = 0;
		
		for (int i = 0; i < hm; i++) 
		{
			if(A[i]>avg)
			{
				v++;
			}
		}
		System.out.println(v + " days were above average");
		
		int u = 0;
		
		for (int i = 0; i < hm; i++) 
		{
			if(A[i]>avg)
			{
				u++;
			}
		}
		System.out.println(u + " days were below average");
		
		System.out.println();
		
		System.out.println("Temperature = " +Arrays.toString(A));
		Arrays.sort(A);
		System.out.println("Sorted the temperature"+Arrays.toString(A));
		
		System.out.println();
		
		System.out.println("Two hottest days =" +A[hm-1]+" and "+ A[hm-2]);
		System.out.println("Two coldest days =" +A[0]+" and "+A[1]);
		
		int[] B= Arrays.copyOf(A, hm);
		int[] C= { 100, 200, 300, 400, 500 };
		
		boolean equal = Arrays.equals(A, C);
		
		if(equal)
		{
			System.out.println(" is Equal");
		}
		else
		{
			System.out.println("not Equal");
			Arrays.fill(C, 34);
			System.out.println("C array value = "+ Arrays.toString(C));
		}
}

}
