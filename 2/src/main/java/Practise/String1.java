package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class String1 {
	
	public void swapChar(int a,int b,String str)
	{
		char ch[]=str.toCharArray();
		
		char temp;
		
		temp=ch[a];
		ch[a]=ch[b];
		ch[b]=temp;
		
		System.out.println(ch);
		
	}
	
	public void StringRev(String str)
	{
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	public void CountDup(String str)
	{
		char ch[]=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:ch)
		{
			if(!map.containsKey(c))
			{
				map.put(c,1);
			}
			else
			{
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println(map);
		
		Set<Character> keys=map.keySet();
		for(Character chr : keys)
		{
			if(map.get(chr)>1)
			{
				System.out.println(chr);
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		
		System.out.println("Enter character indices to swap");
		 int index1=sc.nextInt();
		 int index2=sc.nextInt();
		 
		 String1  s1=new String1();
		
		  s1.swapChar(index1, index2, str); 
		  s1.StringRev(str);
		  s1.CountDup(str);
	}

}
