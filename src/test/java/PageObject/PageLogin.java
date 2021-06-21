package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {

    /**
     *
     id, name, className, css, tagName, linkText, partialLinkText, xpath
     https://www.toptal.com/selenium/test-automation-in-selenium-using-page-object-model-and-page-factory
     @FindBy(id="username")
     private WebElement user_name;

     https://www.youtube.com/watch?v=BKefIqoUD3w&list=PLhW3qG5bs-L_mFHirOLEYJ7X2rIXu8SR2&index=7

      * */

    protected WebDriver driver;

    @FindBy(id = "mat-input-0")
    private WebElement email;

    private By email_user = By.id("mat-input-0");

    private By passw_user = By.id("mat-input-1");

    private By btn_login = By.id("login-button");

    public PageLogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //PageFactory.initElements(driver, PageLogin.class);
    }

    public void enterUser(String value){
        this.driver.findElement(this.email_user).clear();
        this.driver.findElement(this.email_user).sendKeys(value);
    }

    public void enterUser(){
        this.email.clear();
        this.email.sendKeys("FindById@grr.la");
    }

    public void enterPassword(String passw){
        this.driver.findElement(this.passw_user).clear();
        this.driver.findElement(this.passw_user).sendKeys(passw);
    }

    public void enterButton(){
        this.driver.findElement(this.btn_login).click();
    }

}
