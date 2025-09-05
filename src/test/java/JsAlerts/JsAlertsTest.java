package JsAlerts;

import Base.BaseTests;
import Pages.JsAlertsPage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JsAlertsTest extends BaseTests {

    @Test
    public void testJsAlert(){

        JsAlertsPage jsAlerts = homePage.clickJsAlerts();

        jsAlerts.clickjsAlert();
        assertEquals(jsAlerts.alertText(), "I am a JS Alert");

        jsAlerts.acceptAlert();
        assertEquals(jsAlerts.getResult(), "You successfully clicked an alert");
    }

    @Test
    public void testJsConfirm(){
        JsAlertsPage jsAlerts = homePage.clickJsAlerts();

        jsAlerts.clickjsConfirm();
        assertEquals(jsAlerts.alertText(), "I am a JS Confirm");

        jsAlerts.cancelAlert();
        assertEquals(jsAlerts.getResult(), "You clicked: Cancel");
    }

    @Test
    public void testJsPrompt(){
        String prompt = "Hello";

        JsAlertsPage jsAlerts = homePage.clickJsAlerts();

        jsAlerts.clickjsPrompt();
        assertEquals(jsAlerts.alertText(), "I am a JS prompt");

        jsAlerts.cancelAlert();
        assertEquals(jsAlerts.getResult(), "You entered: null");

        jsAlerts.clickjsPrompt();
        jsAlerts.sendKeysToPrompt(prompt);
        jsAlerts.acceptAlert();
        assertEquals(jsAlerts.getResult(), "You entered: "+prompt );

    }
}
