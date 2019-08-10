package Practise;

public class SecondMax {
	
	public static void main(String args[])
	{
		int first_max=0;
		int second_max=0;
		
		int[] arr= {23,45,6,3,2,4,7,8,9};
		
		int first_min=arr[0];
		int second_min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first_max)
			{
				first_max=second_max;
				second_max=arr[i];
			}
			if(arr[i]>second_max)
			{
				second_max=arr[i];
			}
			if(arr[i]<first_min)
			{
				first_min=second_min;
				second_min=arr[i];
			}
			if(arr[i]<second_min)
			{
				second_min=arr[i];
			}
		}
		System.out.println(first_max);
		System.out.println(second_max);
		System.out.println(first_min);
		System.out.println(second_min);

}
}
