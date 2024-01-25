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

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}







































