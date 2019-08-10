package Practise;

public class StringRevInPlace {
	
	public static void main(String args[])
	{
		String str="I am going to office";
		
		String words[]=str.split(" ");
		
		String rev=" ";
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			rev=rev+sb.reverse()+" ";
		}
		System.out.println(rev);
		
	}

}
