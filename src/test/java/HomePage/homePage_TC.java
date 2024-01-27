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
	By ScrolltoLastTextinPageForFooter = By.xpath("//button[normalize-space()='gfhng']");
	By ScrolltoLastTextinFooter = By.xpath("//p[@class='mb-0 text-white']");
	
	By footerLogo = By.xpath("//a[@class='mb-4 d-inline-block']//img[@alt='LOGO']");
	By fCategory_1 = By.xpath("//a[normalize-space()='test111']");
	By fCategory_2 = By.xpath("//a[normalize-space()='Database']");
	By fCategory_3 = By.xpath("//a[normalize-space()='fwefwef']");
	By fCategory_4 = By.xpath("//a[normalize-space()='mm']");
	By fCategory_5 = By.xpath("//a[normalize-space()='check']");
	By fCategory_6 = By.xpath("//a[normalize-space()='kjngfk']");
	By fCategory_7 = By.xpath("//a[normalize-space()='Machine Learning']");
	By fCategory_8 = By.xpath("//a[normalize-space()='ddd']");
	
	
	public void footerTest() throws InterruptedException{
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(footerLogo).click();
			Thread.sleep(1000);
//			driver.navigate().back();
			
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(fCategory_1).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(fCategory_2).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(fCategory_3).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(fCategory_4).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(fCategory_5).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(fCategory_6).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(fCategory_7).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
			scorllToElement(ScrolltoLastTextinPageForFooter);
			scorllToElement(ScrolltoLastTextinFooter);
			Thread.sleep(1000);
			driver.findElement(fCategory_8).click();
			Thread.sleep(1000);
			driver.navigate().back();
			
		}
	
	By fMail = By.xpath("//a[normalize-space()='mailadress@email.com']");
	public void footerMail() throws InterruptedException{
		scorllToElement(ScrolltoLastTextinPageForFooter);
		scorllToElement(ScrolltoLastTextinFooter);
		Thread.sleep(1000);
		driver.findElement(fMail).click();
		Thread.sleep(1000);
		
	}
	
	By fRiseupLogo = By.xpath("//a[@class='text-white text-uppercase']");
	public void footerRULlogo() throws InterruptedException{
		scorllToElement(ScrolltoLastTextinPageForFooter);
		scorllToElement(ScrolltoLastTextinFooter);
		Thread.sleep(1000);
		driver.findElement(fRiseupLogo).click();
		Thread.sleep(1000);
		
	}

		
		
	}
	






























