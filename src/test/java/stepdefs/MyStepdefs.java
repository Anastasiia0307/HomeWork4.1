package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class MyStepdefs {

    WebDriver driver;
    Homepage1 homePage;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/anastasiiashakhmatova/Downloads/chromedriver");
        driver = new ChromeDriver();
    }


    @Given("^user navigates to the app url$")
    public void userNavigatesToTheAppUrl() {
        String baseUrl = "http://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html";
        driver.get(baseUrl);
    }

    @When("^user fills first name$")
    public void userFillsFirstName() {
        homePage = new Homepage1(driver);
        homePage.setFirstName("Ana");
    }

    @When("^user fills last name$")
    public void userFillsLastName() {
        homePage = new Homepage1(driver);
        homePage.setLastName("Sh");
    }

    @When("^user fills date of birth$")
    public void userFillsDateOfBirth() {
        homePage = new Homepage1(driver);
        homePage.setDateOfBirth("07/03/1993");
    }

    @When("^user fills gender$")
    public void userFillsGender() {
        homePage = new Homepage1(driver);
        homePage.setGender();
    }

    @When("^user fills email$")
    public void userFillsEmail() {
        homePage = new Homepage1(driver);
        homePage.setEmail("naseandbwillbe@gmail.com");
    }

    @When("^user fills company$")
    public void userFillsCompany() {
        homePage = new Homepage1(driver);
        homePage.setCompany("Vision");
    }

    @When("^user fills address$")
    public void userFillsAddress() {
        homePage = new Homepage1(driver);
        homePage.setAddress("111 test st.");
    }

    @When("^user fills password$")
    public void userFillsPassword() {
        homePage = new Homepage1(driver);
        homePage.setPassword("Test12345");
    }

    @When("^user submit form$")
    public void userSubmitForm() {
        homePage = new Homepage1(driver);
        homePage.setSubmit();
    }

    @When("^user fills comment$")
    public void userFillsComment() {
        homePage = new Homepage1(driver);
        homePage.setComment("test comment");
    }

    @When("^user fills ways$")
    public void userFillsWays() {
        homePage = new Homepage1(driver);
        homePage.setWays1();
        homePage.setWays2();
    }

    @When("^user fills jobExpectation$")
    public void userFillsJobExpectation() {
        homePage = new Homepage1(driver);
        homePage.setJobExpectation();
    }

    @When("^user fills roles$")
    public void userFillsRoles() {
        homePage = new Homepage1(driver);
        homePage.setRole();
    }

    @Then("^form is submitted$")
    public void formIsSubmitted() {
        WebElement submitMessage = driver.findElement(By.id("submit-msg"));
        Assert.assertEquals(submitMessage.getText(), "Successfully submitted!");
    }
    @After
    public void close(){
        driver.close();
        driver.quit();
    }

}

