package Practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MaxOccChar {
	
	public static void main(String args[])
	{
		String str="Banana";
		char ch[]=str.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(Character c:ch)
		{
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			}
			else
			{
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println(map);
		Collection<Integer> valueset=map.values();
		System.out.println(valueset);
		List al=new ArrayList<Integer>(valueset);
		Collections.sort(al);
		System.out.println(al);
		
		for(Entry<Character, Integer> entry:map.entrySet())
{
	if(entry.getValue()==al.get(al.size()-1))
	{
		System.out.println("Most repeating character is:"+ entry.getKey());
	}
}
			
			
		
	}
}