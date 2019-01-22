

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;

	By email = By.xpath("//input[@id='email']");// By.id("email")
	By password = By.xpath("//input[@id='pass']");// By.id("pass")
	By login = By.xpath("//button[@id='send2']");// By.id("send2")

	public Login(WebDriver driver) {
		super();
		this.driver = driver;

	}

	public void typeEmail(String username) {
		driver.findElement(email).sendKeys(username);
	}

	public void typePassword(String passwords) {

		driver.findElement(password).sendKeys(passwords);

	}

	public void clickOnLogin() {

		driver.findElement(login).click();
	}

}
