package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {


    //Declaring URL

    String baseURL = "https://demo.nopcommerce.com/";

    //Setting up the browser before each individual test
    @Before
    public void setUp(){
        openBrowser(baseURL);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //Click on the ‘Computers’ Tab
        WebElement clickComputerTab = driver.findElement(By.partialLinkText("Computers"));
        clickComputerTab.click();

        //Verify the text ‘Computers’
        //Declaring the text from the requirements
        String expectedMessage = "Computers";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //Click on the ‘Electronics’ Tab
        WebElement clickElectronics = driver.findElement(By.partialLinkText("Electronics"));
        clickElectronics.click();

        //Verify the text ‘Electronics’
        //Declaring the text from the requirements
        String expectedMessage = "Electronics";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Click on the ‘Apparel’ Tab
        WebElement clickElectronics = driver.findElement(By.partialLinkText("Apparel"));
        clickElectronics.click();

        //Verify the text ‘Apparel’
        //Declaring the text from the requirements
        String expectedMessage = "Apparel";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //Click on the ‘Digital downloads’ Tab
        WebElement clickElectronics = driver.findElement(By.partialLinkText("Digital downloads"));
        clickElectronics.click();

        //Verify the text ‘Digital downloads’
        //Declaring the text from the requirements
        String expectedMessage = "Digital downloads";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //Click on the ‘Books’ Tab
        WebElement clickElectronics = driver.findElement(By.partialLinkText("Books"));
        clickElectronics.click();

        //Verify the text ‘Books’
        //Declaring the text from the requirements
        String expectedMessage = "Books";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Click on the ‘Jewelry’ Tab
        WebElement clickElectronics = driver.findElement(By.partialLinkText("Jewelry"));
        clickElectronics.click();

        //Verify the text ‘Jewelry’
        //Declaring the text from the requirements
        String expectedMessage = "Jewelry";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //Click on the ‘Gift Cards’ Tab
        WebElement clickElectronics = driver.findElement(By.partialLinkText("Gift Cards"));
        clickElectronics.click();

        //Verify the text ‘Gift Cards’
        //Declaring the text from the requirements
        String expectedMessage = "Gift Cards";

        //Verifying the text from the requirements and getting the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);

        //Validating actual vs expected message
        Assert.assertEquals("The text does not match the expected text", actualMessage, expectedMessage);
    }

    //Closing the browser after each individual test
    @After
    public void tearDown(){
        closeBrowser();
    }
}
