package Practise;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapObjectAsValue {
	
	public static void main(String args[])
	{
		HashMap<String, Employee> map=new HashMap<String, Employee>();
		
		Employee emp1=new Employee(100,"A");
		Employee emp2=new Employee(101,"B");
		Employee emp3=new Employee(102,"C");
		Employee emp4=new Employee(103,"D");
		
		map.put(emp1.getEmpName(), emp1);
		map.put(emp2.getEmpName(), emp2);
		map.put(emp3.getEmpName(), emp3);
		map.put(emp4.getEmpName(), emp4);
		
		for(Entry<String,Employee> entry:map.entrySet())
		{
			System.out.println(entry.getKey());
			Employee employee=entry.getValue();
			
		}
		
		
	}

}
