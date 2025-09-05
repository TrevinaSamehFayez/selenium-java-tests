package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;


    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames(){
        clickFrameLinks("Nested Frames");
        return new NestedFramesPage(driver);
    }


    public void clickFrameLinks(String text){
        driver.findElement(By.linkText(text)).click();
    }
}
