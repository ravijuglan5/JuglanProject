package mywalgreens;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	@Test
	public void BrowserTest()
	{
		System.out.println("Browser 1 started");
	}
	
	
	@Test
	public void BrowserTest2()
	{
		System.out.println("Browser 2 started");
		System.out.println("Git changes Browser 2 started");
	}

	@Test
	public void BrowserTest3()
	{
		System.out.println("Browser 2 after branch started");
		System.out.println("Git changes after Browser 2 started");
	}	
	
}
