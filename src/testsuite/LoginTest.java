package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        sendTextToElement(By.xpath("//input[@id='user-name']"),"standard_user");
        sendTextToElement(By.xpath("//input[@id='password']"),"secret_sauce");
        clickOnElement(By.xpath("//input[@id='login-button']"));
        String expectedMessage = "PRODUCTS";
        String actualMessage = getTextFromElement(By.xpath("//span[contains(text(),'Products')]"));
        Assert.assertEquals("Products text is not displayed", expectedMessage, actualMessage);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        sendTextToElement(By.xpath("//input[@id='user-name']"),"standard_user");
        sendTextToElement(By.xpath("//input[@id='password']"),"secret_sauce");
        clickOnElement(By.xpath("//input[@id='login-button']"));
        String expectedMessage = "PRODUCTS";
        String actualMessage = getTextFromElement(By.xpath("//span[contains(text(),'Products')]"));
        Assert.assertEquals("Products text is not displayed", expectedMessage, actualMessage);

    }

}


