package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewLead extends BaseClass {
	
	public ViewLead verifyLeads() {
		String test = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(test.contains("TestLeaf")) {
			System.out.println("Successfull");
		}
		else {
			System.out.println("Not Successfull");
		}
		return this;
	}

}
