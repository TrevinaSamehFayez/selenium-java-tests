package Hovers;

import Base.BaseTests;
import Pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class HoversTest extends BaseTests {
    @Test
    public void testHovers(){
        HoversPage hoversPage = homePage.clickOnHoveres();

        HoversPage.FigureCaption myFigure = hoversPage.hoverOverFigure(1);

        assertTrue(myFigure.isCaptionDisplayed());
        assertTrue(myFigure.getTitle().contains("user1"));
        assertTrue(myFigure.getLink().endsWith("/users/1"));
        assertTrue(myFigure.getLinkText().contains("View profile"));



    }
}
