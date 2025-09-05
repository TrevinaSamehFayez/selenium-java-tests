package DropDown;

import Base.BaseTests;
import Pages.DropDownPage;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class DropDownTest extends BaseTests {

    @Test
    public void testDropDown(){
        DropDownPage dropDown = homePage.clickDropDown();
        String option = "Option 1";
        dropDown.SelectOption(option);

        var value = dropDown.getSelectedOptions();

        assertEquals(value.size(), 1, "Not Equal number of selections");
        assertTrue(value.contains(option));

        dropDown.addMultipleAttribute();




    }
}
