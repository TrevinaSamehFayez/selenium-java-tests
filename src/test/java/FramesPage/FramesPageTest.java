package FramesPage;

import Base.BaseTests;
import Pages.FramesPage;
import Pages.NestedFramesPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class FramesPageTest extends BaseTests {

    @Test
    public void testFrameContent(){

        FramesPage frame = homePage.clickFrames();
        NestedFramesPage nestedFrames = frame.clickNestedFrames();

        assertTrue(nestedFrames.getLeftFrameContent().contains("LEFT"));
        assertTrue(nestedFrames.getMiddleFrameContent().contains("MIDDLE"));
        assertTrue(nestedFrames.getRightFrameContent().contains("RIGHT"));
        assertTrue(nestedFrames.getBottomFrameContent().contains("BOTTOM"));

    }
}
