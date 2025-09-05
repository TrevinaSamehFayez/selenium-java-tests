package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPageExampleTwo {

    private WebDriver driver;
    private By startButton = By.xpath("//*[@id=\"start\"]/button");
    private By loadingIndicator = By.id("loading");
    private By text = By.id("finish");

    public DynamicLoadingPageExampleTwo(WebDriver driver){

        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(text)));
    }

    public String getText(){
        return driver.findElement(text).getText();
    }
}
