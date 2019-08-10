package Practise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringDup {
	
	public static void main(String args[])
	{
		String str="Banana";
		String newStr=" ";
		char ch[]=str.toCharArray();
		
		Set<Character> set=new LinkedHashSet<Character>();
		
		for(char c:ch)
		{
			set.add(c);
		}
		System.out.println(set);
		
	    StringBuilder sb=new StringBuilder();
	    for(Character chr : set)
	    {
	    	sb.append(chr);
	    }
	    newStr=sb.toString();
	    System.out.println(newStr);
	}

}
