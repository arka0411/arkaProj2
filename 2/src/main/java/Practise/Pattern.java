package Practise;

public class Pattern {
		
		public static void main(String args[])
		{
			int n=5;
			int num;
			for(int i=0;i<n;i++)
			{
				num=5;
				
				/* for(int j=2*(n-i);j>=0;j--) { System.out.print(" "); } */
				 
				
			/*
			 * for(int j=n-i;j>1;j--) { System.out.print(" "); System.out.print(" "); }
			 */
				 
				for(int j=0;j<=i;j++)
				{
					System.out.print(num+" ");
					num--;
				}
				System.out.println();
				
			}
		}

	}

