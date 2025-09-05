package JsAlerts;

import Base.BaseTests;
import Pages.FileUploadPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JsFileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){

        FileUploadPage fileUploaded = homePage.clickFileUpload();

        fileUploaded.uploadFile("D:\\Intellij\\Resources\\chromedriver.exe");

        assertEquals(fileUploaded.getUploadedMessage(), "chromedriver.exe");
    }
}

