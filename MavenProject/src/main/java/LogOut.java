

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {

	WebDriver driver;

	By logout = By.linkText("Log Out");// By.xpath("//a[text()='Log Out']")

	public LogOut(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void clickOnLogOut() {
		driver.findElement(logout).click();
	}

}
