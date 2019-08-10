package Practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWords {
	
	public static void main(String args[])
	{
		String str="I am am going going to to to school";
		
		String words[]=str.split(" ");
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		for(String w:words)
		{
			if(!map.containsKey(w))
			{
				map.put(w,1);
			}
			else
			{
				map.put(w, map.get(w)+1);
			}
		}
		System.out.println(map);
		
		Set<String> set=map.keySet();
		for(String s:set)
		{
			if(map.get(s)>1)
			{
				System.out.println(s+" "+map.get(s));
			}
		}
		
		
}
}
