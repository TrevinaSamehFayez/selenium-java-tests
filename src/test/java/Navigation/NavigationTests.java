package Navigation;

import Base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExampleOne();

        windowManager().goBack();
        windowManager().refreshPage();
        windowManager().goForward();
        windowManager().goTo("https://google.com");

    }

    @Test
    public void testSwitchTabs(){
        homePage.clickMultipleWindow().clickHere();

        windowManager().switchToTab("New Window");
    }
}
