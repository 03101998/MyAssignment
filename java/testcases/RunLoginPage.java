package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.LoginPage;

public class RunLoginPage extends BaseClass{
	@BeforeTest
    public void setValues() {
    	fileName="Login";
    }
	@Test(dataProvider="fetchData")
	public void runLogin(String uName,String pWord) {
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pWord)
		.clickLogin();
	}

}
