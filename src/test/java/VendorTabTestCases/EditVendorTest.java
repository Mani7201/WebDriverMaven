package VendorTabTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Utilities.TestUtil;

public class EditVendorTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void editVendor(String companyLegalName, String alternateCompanyName, String bpVendorIDNumber, String planType, String vendorAddress, String vendorSuite, String vendorCity, String vendorState, String vendorCountry, String vendorZipCode, String vendorWebsite, String customerServiceNumber) throws InterruptedException  {
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);

		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorsHyperLink"))));
		Thread.sleep(3000);
		//waitUntil("VendorsHyperLink");
		click("VendorsHyperLink");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("EditVendorButton"))));
		Thread.sleep(3000);
		//waitUntil("EditVendorButton");
		click("EditVendorButton");	
		Thread.sleep(3000);
		reset("InputCompanyLegalName");
		type("InputCompanyLegalName", companyLegalName);
		reset("InputAlternateCompanyName");
		type("InputAlternateCompanyName", alternateCompanyName);
		reset("InputBPVendorIDNumber");
		type("InputBPVendorIDNumber", bpVendorIDNumber);
		//select("SelectPlanType", planType);
		reset("InputVendorAddress");
		type("InputVendorAddress", vendorAddress);
		reset("InputVendorSuite");
		type("InputVendorSuite", vendorSuite);
		reset("InputVendorCity");
		type("InputVendorCity", vendorCity);
		select("SelectVendorCountry", vendorCountry);
		reset("InputVendorZipCode");
		type("InputVendorZipCode", vendorZipCode);
		reset("InputVendorWebSite");
		type("InputVendorWebSite", vendorWebsite);
		reset("InputCustomerServiceNumber");
		type("InputCustomerServiceNumber", customerServiceNumber);
		click("SubmitAddVendorButton");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorsHyperLink"))));
		Thread.sleep(3000);
		Reporter.log("Vendor edited Successfully");
		
		
			
				
		
	}
	
	
	

}
