package Revision;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i = 10; i >= 1 ; i--)
		{
			for ( int j = 0; j < i ; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for ( int i = 1; i <= 10 ; i++)
		{
			for ( int j = 10; j > 0 ; j-- )
			{
				if (j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		} 

	}

}
