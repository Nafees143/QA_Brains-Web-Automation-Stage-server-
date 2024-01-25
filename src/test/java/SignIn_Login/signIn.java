package SignIn_Login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}





































