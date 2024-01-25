package Base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class setup extends commonMethod {
//    public WebDriver driver;

    public static String baseUrl = "https://qaforum-stage-frontend.rultest3.com/";

    public void driverSetup() throws InterruptedException {
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(baseUrl);
        Thread.sleep(3000);
    }

//    public void tearDown() {
//        driver.close();
//    }
}





















