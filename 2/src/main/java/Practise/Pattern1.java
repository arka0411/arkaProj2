package Practise;

public class Pattern1 {
	
	public static void main(String args[])
	{
		int n=5;
		char c;
		
		for(int i=0;i<n;i++)
		{
			c='A';
			for(int j=(n-i);j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
