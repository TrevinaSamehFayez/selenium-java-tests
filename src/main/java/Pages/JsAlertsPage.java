package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsAlertsPage {

    private WebDriver driver;

    private By acceptMsg = By.id("result");

    public JsAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickjsAlert(){
        findAlert("//*[@id=\"content\"]/div/ul/li[1]/button");
    }

    public void clickjsConfirm(){
        findAlert("//*[@id=\"content\"]/div/ul/li[2]/button");
    }

    public void clickjsPrompt(){
        findAlert("//*[@id=\"content\"]/div/ul/li[3]/button");
    }

    public void sendKeysToPrompt(String prompt){
        driver.switchTo().alert().sendKeys(prompt);
    }

    public void findAlert(String path){
        driver.findElement(By.xpath(path)).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String alertText(){
        return driver.switchTo().alert().getText();
    }


    public String getResult (){
        return driver.findElement(acceptMsg).getText();
    }



}
