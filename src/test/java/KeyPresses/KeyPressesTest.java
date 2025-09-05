package KeyPresses;


import Base.BaseTests;
import Pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class KeyPressesTest extends BaseTests {

    @Test
    public void testKeyPresses(){
        KeyPressesPage keyPress = homePage.clickKeyPresses();
        keyPress.enterText("A" +Keys.BACK_SPACE);

        assertEquals(keyPress.getText(), "You entered: BACK_SPACE");
    }

    @Test
    public void testMultipleKeys(){
        KeyPressesPage keyPress = homePage.clickKeyPresses();
        keyPress.enterMultiplText();

        assertEquals(keyPress.getText(), "You entered: 4");

    }
}
