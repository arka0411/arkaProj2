package Practise;

public class Arrays {
	
	private int AccNo=24578;
	
	public int getAccNo()
	{
		return AccNo;
	}
	
	public void setAccNo(int acc)
	{
		AccNo=acc;
	}
	
	public static void main(String[] args)
	{
		
		Arrays arr=new Arrays();
		System.out.println(arr.AccNo);
		/*int arr1[]= {3,2,6,4,8,7};
		int temp;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
			System.out.println(arr1[i]);
			
		}
		System.out.println("Second largest is :" + arr1[arr1.length-2]);
	}*/

}
}
