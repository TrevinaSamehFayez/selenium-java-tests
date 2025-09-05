package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputText = By.id("target");
    private By returnText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputText).sendKeys(text);
    }

    public void enterMultiplText(){
        enterText("\u03C0 = 3.14");
    }

    public String getText(){
        return driver.findElement(returnText).getText();
    }


}
