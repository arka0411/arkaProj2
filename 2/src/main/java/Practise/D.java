package Practise;

public class D extends C {
	
	void draw()
	{
		System.out.println("Draw of child");
	}
	
	public void drink()
	{
		System.out.println("Drink of child");
	}
	
	public static void main(String args[]) {
		
		C c;
		c=new D();
		c.draw();
		c.drink();

	}



}
