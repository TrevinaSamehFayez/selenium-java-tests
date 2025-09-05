package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DynamicLoadingExampleOne {

    private WebDriver driver;
    private By startButton = By.xpath("//*[@id=\"start\"]/button");
    private By loadingIcon = By.id("loading");
    private By text = By.id("finish");

    public DynamicLoadingExampleOne(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIcon)));
    }

    public String getText(){
        return driver.findElement(text).getText();
    }



}
