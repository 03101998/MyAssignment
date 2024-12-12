package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	  public ChromeDriver driver; 
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		driver = new ChromeDriver();
	}
	@And("Load the url")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter the username as {string} and password as {string}")
	public void enter_the_username_as_demosalesmanager_and_password_as_crmsfa(String uName, String pWord) {
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("HomePage should be displayed")
	public void home_page_should_be_displayed() {
	    String title=driver.getTitle();
	    if(title.contains("Leaftaps")) {
	    	System.out.println("HomePage is Verified");
	    }
	    else {
	    	System.out.println("HomePage is not Verified");
	    }
	}
	    
	 @But("ErrorMessage should be displayed")
     public void error_displayed() {
		    String title=driver.findElement(By.id("errorDiv")).getText();
		    if(title.contains("Errors")) {
		    	System.out.println("Error is Verified");
		    }
		    else {
		    	System.out.println("Error is not Verified");
		    }
	}
}




