package Practise;

public class Palindrome {
	
	public boolean IsPalindrome(int n)
	{
		int sum=0,rem;
		int tmp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(tmp==sum)
		return true;
		else
		return false;
	}
	public int NextPalimdrome(int num)
	{
			do {
				num++;
			}
			while(!IsPalindrome(num));
			System.out.println("Next Palindrome:"+num);

			 
			return num;
		}
	public int PreviousPalimdrome(int num)
	{

			do {
				num--;
			}
			while(!IsPalindrome(num));
			System.out.println("Previous Palindrome:"+num);
			return num;
		}
		
			
			
			
		
	public static void main(String args[])
	{
		Palindrome p=new Palindrome();
		p.NextPalimdrome(10);
		p.PreviousPalimdrome(10);
	} 

}
