package SignIn_Login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import Base.setup;

public class signIn extends setup {

	@BeforeMethod
	public void Browser() throws InterruptedException {
		driverSetup();
		// validSignin();
	}

	@Test (priority = 1)
	public void invalid_id_pass() throws InterruptedException {
		signIn_TC negetiveTest = new signIn_TC(driver);
		negetiveTest.wrong_id_pass();

	}

	@Test (priority = 2)
	public void invalid_pass() throws InterruptedException {
		signIn_TC negetiveTest = new signIn_TC(driver);
		negetiveTest.wrong_pass();

	}
	
	@Test (priority = 3)
	public void emptyClick() throws InterruptedException {
		signIn_TC negetiveTest = new signIn_TC(driver);
		negetiveTest.emptyClick();

	}
	
	@Test (priority = 4)
	public void forgotPassword() throws InterruptedException {
		signIn_TC forgotPasswordTest = new signIn_TC(driver);
		forgotPasswordTest.forgotPassword();

	}
	

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}





































