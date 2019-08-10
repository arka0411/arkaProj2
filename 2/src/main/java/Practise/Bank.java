package Practise;

public abstract class Bank {
	
	public void deposit()
	{
		System.out.println("Common deposit");
	}
	
	public void withdraw()
	{
		System.out.println("Common withdraw");
	}
	
	public abstract void calculate();

}
