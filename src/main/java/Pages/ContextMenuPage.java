package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;

    private By contextBox = By.xpath("//*[@id=\"hot-spot\"]");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickOnContextMenu(){

        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(contextBox)).perform();
    }

    public String alertContent(){
        rightClickOnContextMenu();
        String text = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return text;
    }



}
