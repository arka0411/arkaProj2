package Practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLink {

	public static void main(String args[]) throws Exception
	{
		String dir=System.getProperty("user.dir");
		String path="C:\\Users\\ARKA DUTTA\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			CheckLink(url);
		}
	}
public static void CheckLink(String linkUrl) throws IOException,MalformedURLException
{
	URL url=new URL(linkUrl);
	HttpURLConnection con=(HttpURLConnection)url.openConnection();
	con.setConnectTimeout(3000);
	if(con.getResponseCode()==200)
	{
		System.out.println(linkUrl+" "+con.getResponseMessage());
	}
	if(con.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	{
		System.out.println(linkUrl+" "+con.getResponseMessage()+" "+HttpURLConnection.HTTP_NOT_FOUND);
	}
}
}
