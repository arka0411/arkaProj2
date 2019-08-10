package Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class String6 {
	
	public static void main(String args[])
	{
		String str="123ABC45DE";
		String num=" ";
		String alph=" ";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num=num+str.charAt(i);
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				alph=alph+str.charAt(i);
			}
			
		}
		System.out.println(num);
		System.out.println(alph);
		
		char[] ch1=num.toCharArray();
		char[] ch2=alph.toCharArray();
		
		for(int i=0;i<ch1.length;i++)
		{
			StringBuffer sb1=new StringBuffer(ch1[i]);
			System.out.println(sb1);
			for(int j=0;j<ch2.length;j++)
			{
				StringBuffer sb=new StringBuffer(sb1);
				sb.append(ch2[j]);
				System.out.print(sb);
			}
		}

		
	}

}
