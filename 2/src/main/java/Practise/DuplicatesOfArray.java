package Practise;

import java.util.HashMap;
import java.util.Set;

public class DuplicatesOfArray {
	
	public static void main(String args[])
	{
		int arr[]= {1,1,5,6,7,7,7,8,9,9};
		
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i:arr)
		{
			if(!map.containsKey(i))
			{
				map.put(i, 1);
			}
			else
			{
				map.put(i, map.get(i)+1);
			}
		}
		System.out.println(map);
		Set<Integer> set=map.keySet();
		for(int j:set)
		{
			if(map.get(j)>1)
			{
				System.out.println(j + "occured" + map.get(j) + "times");
			}
		}
		}

}
