package Practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayDup {
	
	public static void main(String args[])
	{
		int[] arr= {1,1,1,4,4,5,6,8,8,8,8};
		
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		
		for(Integer i:arr)
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
		
		Set<Integer> set=map.keySet();
		System.out.println("Duplicate occurences are :");
		for(Integer j :set)
		{
			if(map.get(j)>1)
			{
				System.out.println(j+"--->"+map.get(j)+ "times");
		}
	}

}
}
