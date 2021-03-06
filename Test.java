import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;


public class Test extends Testbase {

@org.testng.annotations.Test

public void asUserShouldBeAbleToSendAndReceiveAnEmail()() {
    LoginPage page = new LoginPage(driver);

    page.sendLogin();
    page.sendPassword();
    page.clickOnLogInSubmit();
    page.clickOnButtonCreateNewEmail();
    page.sendAddresseeEmail();
    page.sendMessageSubject();
    page.sendMessageContent();
    page.clickOnSendEmailButton();
    page.checkEmailOnPage();



}

}
