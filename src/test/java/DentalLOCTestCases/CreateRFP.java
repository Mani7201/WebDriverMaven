package DentalLOCTestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import Utilities.TestUtil;

public class CreateRFP extends TestBase {
	
	@Test(dataProvider="getData")
	public void createRFP(String clientName, String loc, String planType, String planName, String reasonForRFP,String intendToBid, String lastDateofRFPSubmission, String vendor, String taskNotes) throws InterruptedException  {
		
		Thread.sleep(3000);
		click("PlansHyperLink");
		Thread.sleep(3000);
		reset("SelectClient");
		type("SelectClient",clientName);
		driver.findElement(By.xpath(OR.getProperty("SelectClient"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		click("CreateRFPBtn");
		Thread.sleep(5000);
		select("CreateRFPLOC",loc);
		click("CreateRFPPlanType");
		click("CreateRFPPlanTypeDHMO");
		select("CreateRFPPlanName",planName);
		select("CreateRFPReasonForRFP",reasonForRFP);
		select("CreateRFPSelectVendors",vendor);
		select("CreateRFPTaskNotes",taskNotes);
		//click("SubmitRFPBtn");
		
	}
		
		
	@DataProvider
	public Object[][] getData(){
		
		String sheetName = "CreateRFP";
		int rows = dentalexcel.getRowCount(sheetName);
		int cols = dentalexcel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for (int rowNum=2; rowNum<=rows; rowNum++)
		{
			for (int colNum=0; colNum<cols; colNum++)
			{
				data[rowNum-2][colNum] = dentalexcel.getCellData(sheetName, colNum, rowNum);
			}
				
		}
		return data;
		
	}	
	

}
	

