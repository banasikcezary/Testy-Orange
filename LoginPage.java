import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;


public class LoginPage {

    @FindBy(id = "login")
     private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement button;

    @FindBy(className = "sc-krvtoX")
    private WebElement send;

    @FindBy(className = "sc-gFaPwZ")
    private WebElement email;

    @FindBy(className = "sc-kAzzGY")
    private WebElement subject;

    @FindBy(css = "div[class=DraftEditor-editorContainer]")
    private WebElement description;

    @FindBy(className = "sc-jtggT")
    private WebElement go;

    @FindBy (xpath = "//*[text()='Bluesoft']")
    private WebElement check;







    private WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }



    public void sendLogin() {
        login.sendKeys("testyasercji123");
    }

    public void sendPassword() {
        password.sendKeys("123456abC");
    }

    public void clickOnLogInSubmit() { button.click(); }

    public void clickOnButtonCreateNewEmail(){ send.click();}

    public void sendAddresseeEmail(){ email.sendKeys("testyasercji123@o2.pl"); }

    public void sendMessageSubject(){ subject.sendKeys("Bluesoft"); }

    public void sendMessageContent(){ description.sendKeys("tralalala"); }

    public void clickOnSendEmailButton(){ go.click(); }

    public void checkEmailOnPage(){ assertEquals(check.getText(), "Bluesoft");}










}

