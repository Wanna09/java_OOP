package Method;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A = {9, 4, 5, 7};
		int []B = {8, 3, 4, 6};
		
		 int []c = Add(A, B);
		 display (c);
		}
	public static int[]Add(int[]a, int[]b){
		int[] C = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			C[i] = a[i]+b[i];
		}
		return C;
	}
	public static void display( int[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]+ " ");
		}
	}

	}


