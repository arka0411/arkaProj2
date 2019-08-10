package Practise;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class String7 {
	
	public static void main(String args[])
	{
		String str="I i aM Am an AN Engineer enGineEr";
		
		String words[]=str.split(" ");
		
		String newStr="";
		
		StringBuilder sb=new StringBuilder();

		for(int i=0;i<words.length;i++)
		{
			if(words[i]!=null)
			{
				for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))
				{
					words[j]=null;
				}
			}
		}
		}
		for(int k=0;k<words.length;k++)
		{
			if(words[k]!=null)
			{
				sb.append(words[k]);
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}
		
		
		
		
			


