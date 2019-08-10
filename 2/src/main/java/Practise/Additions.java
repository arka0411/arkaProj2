package Practise;

public class Additions {
	
	public static void main(String args[])
	{
		int arr[]= {3,4,-7,8,-11,13,-5,0,-6};
		int sum_neg = 0;
		int sum_pos=0;
		int temp;
		int min=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]<min)
				{
					min=arr[i];
				}
				else if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			System.out.println(min);
			System.out.println(max);
		}
		}
			

	

