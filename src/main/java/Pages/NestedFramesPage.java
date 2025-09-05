package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String bottomFrame = "frame-bottom";
    private String leftFrame = "frame-left";
    private String middleFrame = "frame-middle";
    private String rightFrame = "frame-right";

    private By frameText = By.tagName("body");



    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftFrameContent(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text =getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getMiddleFrameContent(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(middleFrame);
        String text =getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getRightFrameContent(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(rightFrame);
        String text = getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomFrameContent(){
        driver.switchTo().frame(bottomFrame);
        String text = getText();
        driver.switchTo().parentFrame();
        return text;
    }



    private String getText(){
        return driver.findElement(frameText).getText();
    }

}
