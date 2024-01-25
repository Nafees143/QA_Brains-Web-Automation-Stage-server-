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
	
	
	

}





























