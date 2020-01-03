import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public class Testbase {


    public WebDriver driver;

    @BeforeMethod
    public void beforeTest(){

        System.setProperty("webdriver.chrome.driver", "C:/DRIVERS/chromedriver.exe" );
        driver = new ChromeDriver();
        driver.navigate().to("https://poczta.o2.pl/zaloguj");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }





    @AfterMethod
    public void afterTest(){

        driver.close();
        driver.quit();


    }


}
