package Practise;

public class HDFC extends Bank {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Calculate according to HDFC rule");
	}
	
	public static void main(String args[])
	{
		Bank b=new HDFC();
		b.deposit();
		b.withdraw();
		b.calculate();
	}

}
