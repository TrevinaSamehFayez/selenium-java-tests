package JavaScript;

import Base.BaseTests;
import Pages.LargeAndDeepDOMPage;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){

        homePage.clickLargeAndDeepDOM().scrollToTable();

    }

    @Test
    public void testInfiniteScroll(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
