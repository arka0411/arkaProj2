package Practise;

import java.awt.List;
import java.util.ArrayList;

public class Array8 {
	
	public static void main(String args[])
	{
		int arr[]= {10,8,7,4,70};
		
		int diff = 0;
		int i,j,k = 0;
		int newArr[]=new int[arr.length-1];
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				diff=arr[i]-arr[j];
				for(k=0;k<newArr.length;k++)
				{
					System.out.println(newArr[diff]=diff);
					break;
				}
			}
		}

		
		
		
	}
}
	

	
