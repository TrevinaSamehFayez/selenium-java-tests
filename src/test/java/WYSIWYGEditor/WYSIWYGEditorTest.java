package WYSIWYGEditor;

import Base.BaseTests;
import Pages.WYSIWYGEditorPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WYSIWYGEditorTest extends BaseTests {

    @Test
    public void testWYSIWYGEditor(){

        WYSIWYGEditorPage editor = homePage.clickWYSIWYGEditor();

        assertEquals(editor.getTextAreaContent(), "Your content goes here.");

    }
}
