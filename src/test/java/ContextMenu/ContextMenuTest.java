package ContextMenu;

import Base.BaseTests;
import Pages.ContextMenuPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {

    @Test
    public void testConextMenu(){

        ContextMenuPage contextMenu = homePage.clickContextMenu();

        assertEquals(contextMenu.alertContent(), "You selected a context menu");
    }
}
