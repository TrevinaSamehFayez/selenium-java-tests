package Login;

import Base.BaseTests;
import Pages.LoginPage;
import Pages.SecurePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){

        LoginPage loginPage = homePage.clickFormAuth();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLoginButton();

        assertEquals(securePage.checkAlert(), "You logged into a secure area!\n" +
                "×", "Alert text is incorrect!");

    }
}
