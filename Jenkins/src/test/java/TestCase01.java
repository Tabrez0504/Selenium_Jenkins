import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase01 {
	
	@Test
	public void ktmTestCase()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ktmindia.com/");
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.ktmindia.com/","Ktm test case is Failed..");
		Reporter.log("Ktm test case is Failed..",true);
		
		driver.close();
	}

}
