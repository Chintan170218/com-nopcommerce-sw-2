package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    //Declaring URL
    String baseUrl = "https://demo.nopcommerce.com/";

    //Setting up the browser before each individual test
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        //Click on the ‘Login’ link
        WebElement clickLogin = driver.findElement(By.linkText("Log in"));
        clickLogin.click();

        //Declaring the text from the requirements
        String expectedMessage = "Welcome, Please Sign In!";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The actual message does not match the expected message", actualMessage, expectedMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        //Click on the ‘Login’ link
        WebElement clickLogin = driver.findElement(By.linkText("Log in"));
        clickLogin.click();

        //Enter valid username
        WebElement enterUsername = driver.findElement(By.id("Email"));
        enterUsername.sendKeys("ctiwari@outlook.com");

        //Enter valid password
        WebElement enterPassword = driver.findElement(By.id("Password"));
        enterPassword.sendKeys("erferf");

        //Click on Login button
        WebElement clickLoginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        clickLoginBtn.click();

        //Verify the ‘Log out’ text is display

        String expectedMessage = "Log out";

        //Find the Log Out text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validate actual and expected message
        Assert.assertEquals("The program hasn't navigated to the next page successfully", actualMessage, expectedMessage);
    }

    @Test
    public void verifyTheErrorMessage() {

        //click on the ‘Login’ link
        WebElement clickLogin = driver.findElement(By.linkText("Log in"));
        clickLogin.click();

        //Enter invalid username
        WebElement enterEmail = driver.findElement(By.id("Email"));
        enterEmail.sendKeys("mrbean1997@outlook.com");

        //Enter invalid password
        WebElement enterPassword = driver.findElement(By.id("Password"));
        enterPassword.sendKeys("HelloWorld");

        //Click on Login button
        WebElement clickLoginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        clickLoginBtn.click();

        //Verify the error message

        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        WebElement actualMessageElement = driver.findElement(By.cssSelector(".validation-summary-errors"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validate actual and expected message
        Assert.assertEquals("The program hasn't created the error message successfully", actualMessage, expectedMessage);
    }

    //Closing the browser after each individual test
    @After
    public void teardown(){
        closeBrowser();
    }
}
