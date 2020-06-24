package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTestProcessAssociate extends TestBase{
	
	@Test
	public void loginToLockTon() throws InterruptedException {
	
		
		type("LoginUsername", "scugno@lockton.com");
		type("Loginpass", "123456");
		click("LoginBtn");
		//waitUntil("VendorsHyperLink");
		
		Thread.sleep(6000);
		verifyTrue("DashBoardHyperLink");
		
		Reporter.log("Login Successfully");	
		
	}

}
