

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	public void magento() {

		String url = "http://www.magento.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	
		
		// abstract code since we don't know the working 
		
		Home home = new Home(driver);
		home.clickOnMyaccount();
		
		Login login = new Login(driver);
		login.typeEmail("nitinmanjunath1991@gmail.com");
		login.typePassword("Welcome123");
		login.clickOnLogin();
		
		LogOut logOut = new LogOut(driver);
		logOut.clickOnLogOut();
		
		driver.quit();

	}

}
