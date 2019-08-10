package Practise;

public class Max_Min {
	
	public static void main(String args[])
	{
		int[] arr= {7,8,2,6,9,11,13,23,25};
		
		int first_max=0;
		int second_max=0;
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first_max)
			{
				first_max=arr[i];
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
			}
		}
		System.out.println(first_max);
		System.out.println(min);

}
}
