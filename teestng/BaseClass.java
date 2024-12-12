package teestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
        public ChromeDriver driver;
        
     @BeforeSuite  
     public void reportStart() {
			System.out.println("Before Suite");
		}
     @BeforeTest
     public void assignTheVaue() {
            System.out.println("Before Test");
	}
     @BeforeClass
     public void assignedTheVaue() {
         System.out.println("Before Class");
	}
        
        
    @BeforeMethod
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

	}
    @AfterMethod    
	public void postCondition() {
		driver.close();

	}
}
