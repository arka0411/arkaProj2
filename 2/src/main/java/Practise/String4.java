package Practise;

public class String4 {
	
	public static void main(String args[])
	{
		String str="I am going to school	 ";
		
		String words[]=str.split(" ");
		
		System.out.println("words=" + words.length);
		
		char ch[]=str.toCharArray();
		
		int spaceCount=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' '||ch[i]=='\t')
			{
				spaceCount++;
			}
		}
		System.out.println(spaceCount);
		
		
	}

}
