package Pac2;

import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * 
 * @author jyotijaya
 *
 */
public class Test1 
{
@Test()
public void m1()
{
	/*m1 executed*/
	Reporter.log("m1 executed");
	System.out.println("m1 passed");
}
@Test()
public void m2()
{
	
	/*m2 executed*/
	Reporter.log("m2 executed");
	System.out.println("m2 passed");
}
@Test()
public void m3()
{
	/*m3 executed*/
	Reporter.log("m3 executed");
	System.out.println("m3 passed");
}
}
