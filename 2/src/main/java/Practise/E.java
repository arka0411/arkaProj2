package Practise;

public class E {
	
	E()
	{
		this(10);
		System.out.println("Const of E");
	}
	E(int x)
	{
		System.out.println("Param");
		System.out.println(x);
	}
	
	public static void main(String args[])
	{
		E e = new E();
	}

}
