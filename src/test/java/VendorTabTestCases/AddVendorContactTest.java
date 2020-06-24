package VendorTabTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Utilities.TestUtil;

public class AddVendorContactTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void addVendorContact(String InputFirstName, String InputLastName, String InputTitleCompany, String SelectTitle, String SelectPlanTypeAddContact, String SelectGroupSize, String SelectRegion, String SelectAccountSegment, String SelectProduct, String SelectLoctonOffice, String SelectLocktonTeamAssignment, String InputWorkPhone,String InputCellPhone,String InputEmail,String InputVendorAddress,String InputVendorCity,String SelectVendorState,String SelectVendorCountry,String InputVendorZipCode,String InputNotes,String InputPrimaryContactSupervisorFirstname,String InputPrimaryContactSupervisorLastName,String InputPrimaryContactSupervisorTitle,String InputPrimaryContactSupervisorWorkPhone,String InputPrimaryContactSupervisorCellphone,String InputPrimaryContactSupervisoremail,String InputSalesContactSupervisorFirstname,String InputSalesContactSupervisorLastName,String InputSalesContactSupervisorTitle,String InputSalesContactSupervisorWorkPhone,String InputSalesContactSupervisorCellphone,String InputSalesContactSupervisoremail) throws InterruptedException  {
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);

		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorsHyperLink"))));
		Thread.sleep(3000);
		click("VendorsHyperLink");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorDetailButton"))));
		Thread.sleep(3000);		
		click("VendorDetailButton");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorContactInformationButton"))));
		Thread.sleep(3000);
		click("VendorContactInformationButton");
		Thread.sleep(3000);		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("AddContactButton"))));
		click("AddContactButton");
		Thread.sleep(3000);
		
		type("AddContactInputFirstName", InputFirstName);
		type("AddContactInputLastName", InputLastName);
		type("AddContactInputTitleCompany", InputTitleCompany);
		select("AddContactSelectTitle", SelectTitle);
		click("AddContactSelectPlanType");
		click("AddContactPlanTypeSelectAlloption");
		select("AddContactSelectGroupSize", SelectGroupSize);
		select("AddContactSelectRegion", SelectRegion);
		select("AddContactSelectAccountSegment", SelectAccountSegment);
		select("AddContactSelectProduct", SelectProduct);
		select("AddContactSelectLoctonOffice", SelectLoctonOffice);
		select("AddContactSelectLocktonTeamAssignment", SelectLocktonTeamAssignment);
		type("AddContactInputWorkPhone", InputWorkPhone);
		type("AddContactInputCellPhone", InputCellPhone);
		type("AddContactInputEmail", InputEmail);
		type("AddContactInputVendorAddress", InputVendorAddress);
		type("AddContactInputVendorCity", InputVendorCity);
		//select("AddContactSelectVendorState", SelectVendorState);
		select("AddContactSelectVendorCountry", SelectVendorCountry);
		type("AddContactInputVendorZipCode", InputVendorZipCode);
		type("AddContactInputNotes", InputNotes);
		type("AddContactInputPrimaryContactSupervisorFirstname", InputPrimaryContactSupervisorFirstname);
		type("AddContactInputPrimaryContactSupervisorLastName", InputPrimaryContactSupervisorLastName);
		type("AddContactInputPrimaryContactSupervisorTitle", InputPrimaryContactSupervisorTitle);
		type("AddContactInputPrimaryContactSupervisorWorkPhone", InputPrimaryContactSupervisorWorkPhone);
		type("AddContactInputPrimaryContactSupervisorCellphone", InputPrimaryContactSupervisorCellphone);
		type("AddContactInputPrimaryContactSupervisoremail", InputPrimaryContactSupervisoremail);
		type("AddContactInputSalesContactSupervisorFirstname", InputSalesContactSupervisorFirstname);
		type("AddContactInputSalesContactSupervisorLastName", InputSalesContactSupervisorLastName);
		type("AddContactInputSalesContactSupervisorTitle", InputSalesContactSupervisorTitle);
		type("AddContactInputSalesContactSupervisorWorkPhone", InputSalesContactSupervisorWorkPhone);
		type("AddContactInputSalesContactSupervisorCellphone", InputSalesContactSupervisorCellphone);
		type("AddContactInputSalesContactSupervisoremail", InputSalesContactSupervisoremail);
		
		click("SubmitAddContactButton");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorsHyperLink"))));
		Thread.sleep(3000);
		Reporter.log("Vendor Contact added Successfully");
		
		
		
		
		
	}
	
	
		
	
	

}
