package Pac2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {
  WebDriver driver;
	@DataProvider(name="testdata")
	public Object[][] test()
	{
		Object[][] obj={{"firefox","abc","123"},{"firefox","def","345"}};
		return obj;
	}
	@Test(dataProvider="testdata")
  public void Test1(String browserName,String user,String password) 
	{
	   
	  if(browserName.equals("firefox"))
	  {
		   driver=new FirefoxDriver();
	  }
	  else if(browserName.equals("firefox"))
	  {
		   driver=new FirefoxDriver();
	  }
		
	driver.get("https://wordpress.com/wp-login.php");
	driver.findElement(By.id("user_login")).sendKeys(user);
	driver.findElement(By.id("user_pass")).sendKeys(password);
	driver.close();
	}
}
