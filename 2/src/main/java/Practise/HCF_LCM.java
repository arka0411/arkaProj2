package Practise;

public class HCF_LCM {
	
	public static void main(String args[])
	{
		int x=6;
		int y=10;
		
		int temp;
		
		int a=x;
		int b=y;
		
		while(b!=0)
		{
			temp=b;
			b=a%b;
			a=temp;
		}
		int hcf=x;
		
		int lcm=(x*y)/hcf;
		
		System.out.println("HCF =" +hcf);
		System.out.println("LCM =" +lcm);
	}

}
