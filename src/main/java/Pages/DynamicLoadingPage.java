package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;

    private By exampleOne = By.xpath("//*[@id=\"content\"]/div/a[1]");
    private By exampleTwo = By.xpath("//*[@id=\"content\"]/div/a[2]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExampleOne clickExampleOne(){
        driver.findElement(exampleOne).click();
        return new DynamicLoadingExampleOne(driver);
    }

    public DynamicLoadingPageExampleTwo clickExampleTwo(){
        driver.findElement(exampleTwo).click();
        return new DynamicLoadingPageExampleTwo(driver);
    }
}
