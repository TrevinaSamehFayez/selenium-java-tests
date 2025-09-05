package DynamicLoading;

import Base.BaseTests;
import Pages.DynamicLoadingExampleOne;
import Pages.DynamicLoadingPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTest extends BaseTests {

    @Test
    public void testDynamicLoadingOne(){
        DynamicLoadingExampleOne dynamicLoading = homePage.clickDynamicLoading().clickExampleOne();
        dynamicLoading.clickStartButton();
        assertEquals(dynamicLoading.getText(), "Hello World!");
    }

    @Test
    public void testDynamicLoadingTwo(){
        DynamicLoadingExampleOne dynamicLoading = homePage.clickDynamicLoading().clickExampleOne();
        dynamicLoading.clickStartButton();
        assertEquals(dynamicLoading.getText(), "Hello World!");
    }
}
