package SignIn_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.setup;

public class signIn_TC extends setup {

	public signIn_TC(WebDriver driver) {
		this.driver = driver;
	}

	// SIGNIN INVALID
	By signin = By.xpath("//a[@href='/auth/login']");
	By email = By.xpath("//input[@placeholder='eg. user@user.com']");
	By password = By.xpath("//input[contains(@placeholder,'Password')]");
	By submitSignin = By.xpath("//button[@type='submit']");

	public void wrong_id_pass() throws InterruptedException {
		driver.findElement(signin).click();
		Thread.sleep(3000);
		driver.findElement(email).sendKeys("nafisNewas@gmail.com");
		Thread.sleep(1000);
		driver.findElement(password).sendKeys("123456789aB&5");
		Thread.sleep(1000);
		driver.findElement(submitSignin).click();
		Thread.sleep(3000);
		driver.findElement(email).clear();
		driver.findElement(password).clear();
		Thread.sleep(3000);
	}

	public void wrong_pass() throws InterruptedException {
		driver.findElement(signin).click();
		Thread.sleep(3000);
		driver.findElement(email).sendKeys("tabassum.a.riseuplabs@gmail.com");
		Thread.sleep(1000);
		driver.findElement(password).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(submitSignin).click();
		Thread.sleep(3000);
		driver.findElement(email).clear();
		driver.findElement(password).clear();
		Thread.sleep(3000);

	}
	

}













































