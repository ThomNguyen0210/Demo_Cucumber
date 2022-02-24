package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {
    WebDriver driver;

    @Before
    public void beforeTest() {

        WebDriverManager.chromedriver().setup();

        //  System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void afterTest() {
        driver.quit();
    }

    @Given("I go to website")
    public void iGoToWebsite() {
        driver.get("https://hrms.cmcglobal.com.vn/login");
    }

    @When("I enter username and password")
    public void iEnterUsernameAndPassword() {
        driver.findElement(By.id("normal_login_username")).sendKeys("ntthom2");
        driver.findElement(By.id("normal_login_password")).sendKeys("123456aA@");
    }

    @When("I click on button Login")
    public void iClickOnButtonLogin() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(5000);
    }

    @Then("I login successfully")
    public void iLoginSuccessfully() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement element = driver.findElement(By.xpath("//div[@class='ant-tabs-tab-active ant-tabs-tab']"));

        Assert.assertTrue("element do not display", element.isDisplayed());
        System.out.println("Đăng nhập thành công");
    }
}
