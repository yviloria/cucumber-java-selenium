package StepDefinitions;

import PageObject.PageLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class loginSteps {

    WebDriver driver;
    PageLogin pageLogin;

   /* @Given("user is on login page")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://vaultbank.ro.appgate.com/authentication");

        pageLogin = new PageLogin(driver);
        //String projectPath = System.getProperty("user.dir");
        //System.out.println("El path es: " + projectPath);

    }*/

   /* @When("^user enter (.*) and (.*)$")
    public void user_enter_username_and_password(String username, String password) throws InterruptedException {
        //pageLogin.enterUser(username);
        pageLogin.enterUser(username);
        Thread.sleep(2000);
        pageLogin.enterPassword(password);
    }*/

    /*
    @When("clicks button login")
    public void clicks_button_login() {
        pageLogin.enterButton();
    }*/

   /* @Then("user navigated home page")
    public void user_navigated_home_page() throws InterruptedException {
        System.out.println("user navigated home page");
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }*/

}
