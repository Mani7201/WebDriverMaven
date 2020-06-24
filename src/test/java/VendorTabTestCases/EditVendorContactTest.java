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

public class EditVendorContactTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void editVendorContact(String InputFirstName, String InputLastName, String InputTitleCompany, String SelectTitle, String SelectPlanTypeAddContact, String SelectGroupSize, String SelectRegion, String SelectAccountSegment, String SelectProduct, String SelectLoctonOffice, String SelectLocktonTeamAssignment, String InputWorkPhone,String InputCellPhone,String InputEmail,String InputVendorAddress,String InputVendorCity,String SelectVendorState,String SelectVendorCountry,String InputVendorZipCode,String InputNotes,String InputPrimaryContactSupervisorFirstname,String InputPrimaryContactSupervisorLastName,String InputPrimaryContactSupervisorTitle,String InputPrimaryContactSupervisorWorkPhone,String InputPrimaryContactSupervisorCellphone,String InputPrimaryContactSupervisoremail,String InputSalesContactSupervisorFirstname,String InputSalesContactSupervisorLastName,String InputSalesContactSupervisorTitle,String InputSalesContactSupervisorWorkPhone,String InputSalesContactSupervisorCellphone,String InputSalesContactSupervisoremail) throws InterruptedException  {
		
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);

		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorsHyperLink"))));
		//Thread.sleep(3000);		
		//click("VendorsHyperLink");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorDetailButton"))));
		//Thread.sleep(3000);
		//click("VendorDetailButton");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorContactInformationButton"))));
		//Thread.sleep(3000);
		//click("VendorContactInformationButton");	
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("EditContact"))));
		Thread.sleep(3000);
		click("EditContact");
		Thread.sleep(3000);		
		
		reset("AddContactInputFirstName");
		type("AddContactInputFirstName", InputFirstName);
		reset("AddContactInputLastName");
		type("AddContactInputLastName", InputLastName);
		reset("AddContactInputTitleCompany");
		type("AddContactInputTitleCompany", InputTitleCompany);
		select("AddContactSelectTitle", SelectTitle);
		click("EditContactSelectPlanType");
		click("AddContactPlanTypeSelectAlloption");
		select("AddContactSelectGroupSize", SelectGroupSize);
		select("AddContactSelectRegion", SelectRegion);
		select("AddContactSelectAccountSegment", SelectAccountSegment);
		select("AddContactSelectProduct", SelectProduct);
		select("AddContactSelectLoctonOffice", SelectLoctonOffice);
		select("AddContactSelectLocktonTeamAssignment", SelectLocktonTeamAssignment);
		reset("AddContactInputWorkPhone");
		type("AddContactInputWorkPhone", InputWorkPhone);
		reset("AddContactInputCellPhone");
		type("AddContactInputCellPhone", InputCellPhone);
		reset("AddContactInputEmail");
		type("AddContactInputEmail", InputEmail);
		reset("AddContactInputVendorAddress");
		type("AddContactInputVendorAddress", InputVendorAddress);
		reset("AddContactInputVendorCity");
		type("AddContactInputVendorCity", InputVendorCity);
		//select("AddContactSelectVendorState", SelectVendorState);
		select("AddContactSelectVendorCountry", SelectVendorCountry);
		reset("AddContactInputVendorZipCode");
		type("AddContactInputVendorZipCode", InputVendorZipCode);
		reset("AddContactInputNotes");
		type("AddContactInputNotes", InputNotes);
		reset("AddContactInputPrimaryContactSupervisorFirstname");
		type("AddContactInputPrimaryContactSupervisorFirstname", InputPrimaryContactSupervisorFirstname);
		reset("AddContactInputPrimaryContactSupervisorLastName");
		type("AddContactInputPrimaryContactSupervisorLastName", InputPrimaryContactSupervisorLastName);
		reset("AddContactInputPrimaryContactSupervisorTitle");
		type("AddContactInputPrimaryContactSupervisorTitle", InputPrimaryContactSupervisorTitle);
		reset("AddContactInputPrimaryContactSupervisorWorkPhone");
		type("AddContactInputPrimaryContactSupervisorWorkPhone", InputPrimaryContactSupervisorWorkPhone);
		reset("AddContactInputPrimaryContactSupervisorCellphone");
		type("AddContactInputPrimaryContactSupervisorCellphone", InputPrimaryContactSupervisorCellphone);
		reset("AddContactInputPrimaryContactSupervisoremail");
		type("AddContactInputPrimaryContactSupervisoremail", InputPrimaryContactSupervisoremail);
		reset("AddContactInputSalesContactSupervisorFirstname");
		type("AddContactInputSalesContactSupervisorFirstname", InputSalesContactSupervisorFirstname);
		reset("AddContactInputSalesContactSupervisorLastName");
		type("AddContactInputSalesContactSupervisorLastName", InputSalesContactSupervisorLastName);
		reset("AddContactInputSalesContactSupervisorTitle");
		type("AddContactInputSalesContactSupervisorTitle", InputSalesContactSupervisorTitle);
		reset("AddContactInputSalesContactSupervisorWorkPhone");
		type("AddContactInputSalesContactSupervisorWorkPhone", InputSalesContactSupervisorWorkPhone);
		reset("AddContactInputSalesContactSupervisorCellphone");
		type("AddContactInputSalesContactSupervisorCellphone", InputSalesContactSupervisorCellphone);
		reset("AddContactInputSalesContactSupervisoremail");
		type("AddContactInputSalesContactSupervisoremail", InputSalesContactSupervisoremail);
		
		click("SubmitAddContactButton");	
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("VendorsHyperLink"))));
		Thread.sleep(5000);	
		Reporter.log("Vendor Contact Edited Successfully");
		//click("EditContactCrossIcon");
		
		
		
		
		
		
	}
	
	
}
