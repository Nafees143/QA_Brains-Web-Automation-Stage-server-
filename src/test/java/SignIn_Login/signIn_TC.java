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
	
	
	By wrongMsg = By.xpath("//p[@class='text-danger form-group mb-0 ']");
	
	public void emptyClick() throws InterruptedException {
		driver.findElement(signin).click();
		Thread.sleep(3000);
		
		//BLANK CLICK
		driver.findElement(submitSignin).click();
		Thread.sleep(1000);
		PrinterrorMessage(wrongMsg);
		
		//PASSWORD FIELD EMPTY
		driver.findElement(email).sendKeys("nafisNewas@gmail.com");
		Thread.sleep(1000);
		driver.findElement(submitSignin).click();
		Thread.sleep(1000);
		PrinterrorMessage(wrongMsg);
		driver.findElement(email).clear();
		
		
		//EMAIL FIELD EMPTY
		driver.findElement(password).sendKeys("123456789aB&5");
		Thread.sleep(1000);
		driver.findElement(submitSignin).click();
		Thread.sleep(1000);
		PrinterrorMessage(wrongMsg);
		driver.findElement(password).clear();
	}
	
	By forgotPass = By.xpath("//a[normalize-space()='Forgot password?']");
	By resePassBtn = By.xpath("//span[@class='after']");
	By wrongMsgForgetPass = By.xpath("//p[contains(@class,'text-danger form-group mb-0')]");
	By mailField = By.xpath("//input[@placeholder='eg. user@user.com']");
	By forgotPassSignin = By.xpath("//a[normalize-space()='Sign In']");
	
	public void forgotPassword() throws InterruptedException{
		driver.findElement(signin).click();
		Thread.sleep(1000);
		driver.findElement(forgotPass).click();
		Thread.sleep(1000);
		
		driver.findElement(resePassBtn).click();
		Thread.sleep(1000);
		PrinterrorMessage(wrongMsgForgetPass);
		Thread.sleep(1000);
		
		driver.findElement(mailField).sendKeys("wdsftrasgdyuas");
		Thread.sleep(1000);
		driver.findElement(resePassBtn).click();
		Thread.sleep(1000);
		PrinterrorMessage(wrongMsgForgetPass);
		Thread.sleep(1000);
		driver.findElement(mailField).clear();
		Thread.sleep(1000);
		
		driver.findElement(mailField).sendKeys("efafsdsdasd@efasdasd.asdad");
		Thread.sleep(1000);
		driver.findElement(resePassBtn).click();
		Thread.sleep(1000);
		PrinterrorMessage(wrongMsgForgetPass);
		Thread.sleep(1000);
		driver.findElement(mailField).clear();
		Thread.sleep(1000);
		
		driver.findElement(forgotPassSignin).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(mailField).sendKeys("tabassum.a.riseuplabs@gmail.com");
		Thread.sleep(1000);
		driver.findElement(resePassBtn).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}













































