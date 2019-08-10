package Practise;

import java.util.Arrays;
public class Anagram {
	
	public static void main(String args[])
	{
		String str1="pool";
		String str2="loop";
		int i,j = 0;
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		char temp1;
		char temp2;
		for(i=0;i<ch1.length;i++)
		{
			for(j=i+1;j<ch1.length;j++)
			{
				if(ch1[i]>ch1[j])
				{
					temp1=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp1;
				}
			}
			System.out.println(ch1[i]);
		}
		String sorted_s1=new String(ch1);
		System.out.println(sorted_s1);
		
		for(i=0;i<ch2.length;i++)
		{
			for(j=i+1;j<ch2.length;j++)
			{
				if(ch2[i]>ch2[j])
				{
					temp2=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp2;
				}
			}
			System.out.println(ch2[i]);
		}
		String sorted_s2=new String(ch2);
		System.out.println(sorted_s2);
		
		  if(sorted_s1.equals(sorted_s2) && str1.length()==str2.length()) 
		  {
			  System.out.println("Strings are anagrams"); 
		  } 
		  else
		  {
			  System.out.println("Not Anagrams"); 
		  }
		 		
	}

}

