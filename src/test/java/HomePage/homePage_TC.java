package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.setup;

public class homePage_TC extends setup {

	public homePage_TC(WebDriver driver) {
		this.driver = driver;
	}

	// TITLE ASSERTION
	String pageTitle = "QA Brains";

	public void titleAssert() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, actualTitle);
	}

	// LOGO ASSERTION
	String logoTxt = "https://qaforum-stage-frontend.rultest3.com/_next/static/media/logo-b.59f4e16c.svg";
	By logoImg = By.xpath("(//img[@alt='LOGO'])[1]");

	public void logoAssert() {
		String logoText = driver.findElement(logoImg).getAttribute("src");
		Assert.assertEquals(logoTxt, logoText);
	}
	
	//NAVBAR
	By home = By.xpath("//a[normalize-space()='Home']//*[name()='svg']");
	By category = By.xpath("//a[normalize-space()='Category']//*[name()='svg']");
	By aboutUs = By.xpath("//a[normalize-space()='About Us']//*[name()='svg']");
	By logoButton = By.xpath("(//img[@alt='LOGO'])[1]");
	By hireQA = By.xpath("//a[normalize-space()='Hire QA']");
	By writePop = By.xpath("//button[normalize-space()='Cancel']");
	By writePopSignIn = By.xpath("//button[normalize-space()='Sign In']");
	By write = By.xpath("//button[normalize-space()='Write']");
	By signIn = By.xpath("(//span[@class='after'])[1]");
	
	public void navBar() throws InterruptedException{

		driver.findElement(home).click();
		Thread.sleep(1000);
		driver.findElement(category).click();
		Thread.sleep(1000);
		driver.findElement(aboutUs).click();
		Thread.sleep(1000);
		driver.findElement(logoButton).click();
		Thread.sleep(1000);
		driver.findElement(signIn).click();
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(write).click();
		Thread.sleep(1000);
		driver.findElement(writePop).click();
		Thread.sleep(1000);
		driver.findElement(write).click();
		Thread.sleep(1000);
		driver.findElement(writePopSignIn).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(hireQA).click();
		Thread.sleep(1000);
	}
	
	//FOOTER
	
	
	

}





























