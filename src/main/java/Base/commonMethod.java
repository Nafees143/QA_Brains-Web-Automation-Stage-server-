package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class commonMethod {

    public WebDriver driver;
    
    // SCROLL
    public void scorllToElement(By scrollFind) throws InterruptedException {
         WebElement scrollFindOne = driver.findElement(scrollFind);
         JavascriptExecutor je = (JavascriptExecutor) driver;
         je.executeScript("arguments[0].scrollIntoView();", scrollFindOne);
         Thread.sleep(3000);
    }
    
    // VALID SIGNIN
    By signin = By.xpath("//a[@href='/auth/login']");
    By email = By.xpath("//input[@placeholder='eg. user@user.com']");
    By password = By.xpath("//input[contains(@placeholder,'Password')]");
    By submitSignin = By.xpath("//button[@type='submit']");
    public void validSignin() throws InterruptedException {
    	driver.findElement(signin).click();
    	Thread.sleep(3000);
    	driver.findElement(email).sendKeys("tabassum.a.riseuplabs@gmail.com");
    	Thread.sleep(1000);
    	driver.findElement(password).sendKeys("123456789aB&5");
    	Thread.sleep(1000);
    	driver.findElement(submitSignin).click();
    	Thread.sleep(3000);
    	
    }
    
}


//scroll element's 

//public void scroll() throws InterruptedException {
//	homePage_TC testCase = new homePage_TC(driver);
//			testCase.scrollText();
//}



//scroll path from T_C
//By faq = By.xpath("//h2[text()='Frequently asked questions']");
//public void scrollText() throws InterruptedException {
//	scorllToElement(faq);
//	Thread.sleep(3000);
//}


























