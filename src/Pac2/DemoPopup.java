package Pac2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class DemoPopup {

	
	public static void main(String[] args) throws IOException 
	{
		
			
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.seleniumeasy.com/testng-tutorials/timeout-test-in-testng");
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		for(int i=0;i<lst.size();i++)
		{
			String url=lst.get(i).getAttribute("href");
			verifyURL(url);
		}
	}
	
	
	public static void verifyURL(String linkURL) throws IOException
	{
		URL url=new URL(linkURL);
		HttpURLConnection h=(HttpURLConnection)url.openConnection();
		h.setConnectTimeout(3000);
		h.connect();
		if(h.getResponseCode()==200)
		{
			System.out.println(linkURL+"-"+h.getResponseMessage());
		}
		if(h.getResponseCode()!=200)
		{
			System.out.println(linkURL+"_"+h.getResponseMessage());
		}
		
	}
			
}


