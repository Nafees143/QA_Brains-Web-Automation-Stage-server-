package HomePage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.setup;



public class homePage extends setup{
	

    @BeforeMethod
    public void Browser() throws InterruptedException {
        driverSetup();
    	//validSignin();
    }
    
    // ASSERTION TITLE AND LOGO
    @Test ( priority=1 )
    public void titleAndLogoAssert() {
    	homePage_TC testCase = new homePage_TC(driver);
    	testCase.titleAssert();
    	testCase.logoAssert();
    }
    
    @Test ( priority = 2 )
    public void navigation() throws InterruptedException {
    	homePage_TC testCase = new homePage_TC(driver);
    	testCase.navBar();
    }
    
    @Test ( priority = 3 )
    public void footer() throws InterruptedException {
    	homePage_TC testCase = new homePage_TC(driver);
    	testCase.footerTest();
    }
    
    @Test ( priority = 4 )
    public void footerMail() throws InterruptedException {
    	homePage_TC testCase = new homePage_TC(driver);
    	testCase.footerMail();
    }
    
    @Test ( priority = 5 )
    public void footerRULlogo() throws InterruptedException {
    	homePage_TC testCase = new homePage_TC(driver);
    	testCase.footerRULlogo();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}







































