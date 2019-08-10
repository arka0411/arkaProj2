package Practise;

import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {
	
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		int[] arr= {9,0,7,5,4,3,11};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		/*Sort the array and put it to set functions*/
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=arr[0];i<arr[arr.length-1];i++)
		{
			set.add(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			set.remove(arr[i]);
		}
		System.out.println(set);
		for(int x :set)
		{
			set.add(x);
		}
		
		System.out.println("Missing numbers are :" + set);	
	}
		
}
