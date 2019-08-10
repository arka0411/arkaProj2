package Practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllValuesofTable {
	
	public static void main(String args[])
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount=rows.size();
		System.out.println(rowCount);
		
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(cols.size());
		
		String firstPart="//table[@id='customers']/tbody/tr[";
		String secondPart="]/td[";
		String thirdPart="]";
		
		ArrayList allList=new ArrayList<String>();
		for(int i=2;i<rowCount;i++)
		{
			for(int j=1;j<=cols.size();j++)
			{
				String xpath=(firstPart+i+secondPart+j+thirdPart);
				
				String AllValues=driver.findElement(By.xpath(xpath)).getText();
				System.out.println(AllValues);
				allList.add(AllValues);
				Collections.sort(allList);
			}
		}
		System.out.println(allList);
	}

}
