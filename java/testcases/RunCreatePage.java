package testcases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;


public class RunCreatePage extends BaseClass {
	@BeforeTest
    public void setValues() {
    	fileName="Create Lead";
	}
	@Test(dataProvider="fetchData")
    public void runCreateLead(String uName,String pWord, String cName, String fName,String lName) {
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmit();
	}
}
