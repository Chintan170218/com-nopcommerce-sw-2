package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RegisterTest extends BaseTest {

    //Declaring URL

    String baseUrl = "https://demo.nopcommerce.com/";

    //Setting up the browser before each individual test
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Click on the ‘Register’ link
        WebElement clickRegisterBtn = driver.findElement(By.partialLinkText("Register"));
        clickRegisterBtn.click();

        //Verify the text ‘Register’
        //Declaring the text from the requirements
        String expectedMessage = "Register";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click on the ‘Register’ link
        WebElement clickRegisterBtn = driver.findElement(By.partialLinkText("Register"));
        clickRegisterBtn.click();

        //Select gender radio button
        WebElement clickRadioBtn = driver.findElement(By.id("gender-male"));
        clickRadioBtn.click();

        //Enter First name
        WebElement enterFirstName = driver.findElement(By.id("FirstName"));
        enterFirstName.sendKeys("Rajni");

        //Enter Last name
        WebElement enterLastName = driver.findElement(By.id("LastName"));
        enterLastName.sendKeys("Kant");

        //Select Day, Month and Year
        Select drpDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        drpDay.selectByVisibleText("10");

        Select drpMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        drpMonth.selectByVisibleText("May");

        Select drpYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
        drpYear.selectByVisibleText("1987");

        //Enter Email address
        WebElement enterEmail = driver.findElement(By.id("Email"));
        enterEmail.sendKeys("rajniikant2009@outlook.com");

        //Enter Password
        WebElement enterPassword = driver.findElement(By.id("Password"));
        enterPassword.sendKeys("RobotNo.1");

        //Enter Confirm password
        WebElement enterConfirmationEmail = driver.findElement(By.id("ConfirmPassword"));
        enterConfirmationEmail.sendKeys("RobotNo.1");

        //Click on REGISTER button
        WebElement clickBlueRegisterBtn = driver.findElement(By.id("register-button"));
        clickBlueRegisterBtn.click();

        //Verify the text 'Your registration completed’
        //Declaring the text from the requirements
        String expectedMessage = "Your registration completed";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    //Closing the browser after each individual test
    @After
    public void tearDown() {
        closeBrowser();
    }
}
