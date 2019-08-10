package Practise;

public class Child extends Parent {
	
	public void Draw()
	{
		System.out.println("Draw of child");
	}
	
	public static void main(String args[])
	{
		Child c=new Child();
		c.Draw();
		c.Drive();
	}

}
