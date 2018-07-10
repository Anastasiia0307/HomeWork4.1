package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage1 {
    WebDriver driver;
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By gender = By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[2]/input");
    By dateOfBirth = By.id("dob");
    By address = By.id("address");
    By email = By.id("email");
    By password = By.id("password");
    By company = By.id("company");
    By role = By.id("role");
    By jobExpectation = By.id("expectation");
    By ways1 = By.xpath("//html//div[2]/label[1]/input[1]");
    By ways2 = By.xpath("//html//div[6]/label[1]/input[1]");
    By comment = By.id("comment");
    By submit = By.id("submit");

    public Homepage1(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String strFirstName) {
        driver.findElement(firstName).sendKeys(strFirstName);
    }

    public void setLastName(String strLastName) {
        driver.findElement(lastName).sendKeys(strLastName);
    }

    public void setGender() {
        driver.findElement(gender).click();
    }

    public void setDateOfBirth(String strDateOfBirth) {
        driver.findElement(dateOfBirth).sendKeys(strDateOfBirth);
    }

    public void setAddress(String strAddress) {
        driver.findElement(address).sendKeys(strAddress);
    }

    public void setEmail(String strEmail) {
        driver.findElement(email).sendKeys(strEmail);
    }

    public void setPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }

    public void setCompany(String strCompany) {
        driver.findElement(company).sendKeys(strCompany);
    }

    public void setRole() {
        Select aRole = new Select(driver.findElement(role));
        aRole.selectByVisibleText("QA");
    }

    public void setJobExpectation() {
        Select aJobExpectation = new Select(driver.findElement(jobExpectation));
        aJobExpectation.selectByVisibleText("Good teamwork");
        aJobExpectation.selectByVisibleText("High salary");
        aJobExpectation.selectByVisibleText("Challenging");
    }

    public void setWays1() {
        WebElement aways1 = driver.findElement(ways1);
        if (!aways1.isSelected()) {
            aways1.click();
        }
    }

    public void setWays2() {
        WebElement aways2 = driver.findElement(ways2);
        if (!aways2.isSelected()) {
            aways2.click();
        }
    }

    public void setComment(String strComment) {
        driver.findElement(comment).sendKeys(strComment);
    }

    public void setSubmit() {
        driver.findElement(submit).click();
    }

}
