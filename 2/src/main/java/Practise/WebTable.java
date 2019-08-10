package Practise;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String args[])
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		/*Row count and values*/
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount=rows.size();
		System.out.println(rowCount);
		String before_row="//table[@id='customers']/tbody/tr[";
		String after_row="]/td[1]";
		
		List country=new ArrayList<String>();
		for(int i=2;i<=rowCount;i++)
		{
			String rowVal=driver.findElement(By.xpath(before_row+i+after_row)).getText();
			country.add(rowVal);
		}
		Collections.sort(country,Collections.reverseOrder());
		System.out.println(country);
		
		
		/*column count and values*/
		String beforeXpath="//table[@id='customers']/tbody/tr[1]/th[";
		String afterXpath="]";
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(cols.size());
		for(int i=1;i<=cols.size();i++)
		{
			String colText=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.println(colText);
		}
		
		/*particular value*/
		
		WebElement value=driver.findElement(By.xpath("//td[contains(text(),'Ernst Handel')]/following-sibling::td[1]"));
		String colValue=value.getText();
		System.out.println(colValue);
	}

}
