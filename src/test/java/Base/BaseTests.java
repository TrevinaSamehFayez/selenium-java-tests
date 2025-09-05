package Base;

import Pages.HomePage;
import Utils.WindowManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");

        driver = new ChromeDriver();
        goHome();
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        homePage = new HomePage(driver);


    }


    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    public WindowManager windowManager(){
        return new WindowManager(driver);
    }

    @AfterMethod
    public void takeScreenshot(ITestResult result) {

        String fileName = "screenshot_" + result.getName()+ ".png";
        Path destinationPath = Paths.get(System.getProperty("user.dir"), "Resources", "screenshots", fileName);
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            Files.createDirectories(destinationPath.getParent());

            Files.copy(screenshotFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
