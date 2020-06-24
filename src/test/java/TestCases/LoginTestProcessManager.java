package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTestProcessManager extends TestBase{
	
	@Test
	public void loginToLockTon() throws InterruptedException {
	
		
		type("LoginUsername", "kbeinecke@lockton.com");
		type("Loginpass", "123456");
		click("LoginBtn");
		//waitUntil("VendorsHyperLink");
		
		Thread.sleep(3000);
		verifyTrue("DashBoardHyperLink");
		
		Reporter.log("Login Successfully");	
		
	}

}
