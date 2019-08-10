package Practise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class DropdownWithoutSelect {
	
	public static void main(String args[])
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select month=new Select(drop);
		
		List<WebElement> allOptions=month.getOptions();
		
		SoftAssert sa=new SoftAssert();
		sa.assertFalse(allOptions.isEmpty());
		
		sa.assertAll();
		
		for(int i=1;i<allOptions.size();i++)
		{
			System.out.println(allOptions.get(i).getText());
		}
		
		
	}

}
