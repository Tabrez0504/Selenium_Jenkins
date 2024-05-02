import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestCase03 {

	@Test
public void royalTestCase()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.royalenfield.com/");
	
	
	Assert.assertEquals(driver.getTitle(), "Bikes in India | New Bike Model 2024 | Royal Enfield India", "RoyalEnfield Motorcycle Page is Not Displayed.."); 
	Reporter.log("RoyalEnfield Motorcycle Page is  Displayed..", true);
	
	driver.close();
}
}
