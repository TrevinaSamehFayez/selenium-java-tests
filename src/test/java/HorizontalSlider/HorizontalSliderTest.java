package HorizontalSlider;

import Base.BaseTests;
import Pages.HorizontalSliderPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        String value = "4";
        HorizontalSliderPage horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.moveSlider(value);

        assertEquals(horizontalSlider.getValue(), value);


    }
}
