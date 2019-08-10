package Practise;

public class Arrays3 {
	
	public static void main(String args[])
	{
		int arr[]= {6,7,5,3,2,11,9,10};
		
		int first=0,second=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				first=second;
				second=arr[i];
			}
			else if(arr[i]>second)
			{
				second=arr[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
	}

}
