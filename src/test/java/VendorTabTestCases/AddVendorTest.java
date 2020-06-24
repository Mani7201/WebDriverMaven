package VendorTabTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Utilities.TestUtil;

public class AddVendorTest extends TestBase {
	
	
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void addVendor(String companyLegalName, String alternateCompanyName, String bpVendorIDNumber, String planType, String vendorAddress, String vendorSuite, String vendorCity, String vendorState, String vendorCountry, String vendorZipCode, String vendorWebsite, String customerServiceNumber) throws InterruptedException  {
		
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);

		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorsHyperLink"))));
		
		Thread.sleep(3000);
		//waitUntil("VendorsHyperLink");
		click("VendorsHyperLink");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("AddVendorButton"))));
		Thread.sleep(3000);
		//waitUntil("AddVendorButton");
		click("AddVendorButton");		
		Thread.sleep(3000);	
		//Assert.fail("Vendor Test Case forcefully Failed");
		verifyTrue("InputCompanyLegalName");		
		//waitUntil("InputCompanyLegalName");
		//Assert.assertEquals(true, false, "Failing Test Case");		
		type("InputCompanyLegalName", companyLegalName);
		type("InputAlternateCompanyName", alternateCompanyName);
		type("InputBPVendorIDNumber", bpVendorIDNumber);
		//select("SelectPlanType", planType);
		type("InputVendorAddress", vendorAddress);
		type("InputVendorSuite", vendorSuite);
		type("InputVendorCity", vendorCity);
		select("SelectVendorCountry", vendorCountry);
		//select("SelectVendorState", vendorState);
		type("InputVendorZipCode", vendorZipCode);
		type("InputVendorWebSite", vendorWebsite);
		type("InputCustomerServiceNumber", customerServiceNumber);
		click("SubmitAddVendorButton");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorsHyperLink"))));
		Thread.sleep(3000);
		Reporter.log("Vendor added Successfully");
		
		
					
				
		
	}
	

	

}
