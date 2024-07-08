package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage {
    @FindBy(className = "align-baseline")
    public List<WebElement> userIcon;
    @FindBy(className = "btn-primary")
    public List<WebElement> btnSignup;
    @FindBy(className = "b-textinput")
    public List<WebElement> txtFiled;
    @FindBy(css = "[Type=checkbox]")
    public List<WebElement> checkBox;

    @FindBy(className = "btn-primary")
    public WebElement btnCreateAccount;

    @FindBy(className = "btn")
    public List<WebElement> btnLogOut;

    @FindBy(className = "contact-btn")
    public WebElement btnContact;
    @FindBy(className = "b-textinput")
    public List<WebElement> txtCred;

    @FindBy(className = "b-login-form__submit")
    public WebElement btnSubmit;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void createAccount(String firstName, String lastName, String phone, String email, String password) throws InterruptedException {
        userIcon.get(0).click();
        btnSignup.get(2).click();
        Thread.sleep(7000);
        txtFiled.get(3).sendKeys(firstName);
        txtFiled.get(4).sendKeys(lastName);
        txtFiled.get(5).sendKeys(phone);
        txtFiled.get(6).sendKeys(email);
        txtFiled.get(7).sendKeys(email);
        txtFiled.get(8).sendKeys(password);
        txtFiled.get(9).sendKeys(password);
        checkBox.get(0).click();
        checkBox.get(1).click();
        btnCreateAccount.click();
    }

    public void doLogin(String email, String password) throws InterruptedException {
        userIcon.get(0).click();
        Thread.sleep(7000);
        txtCred.get(3).sendKeys(email);
        txtCred.get(4).sendKeys(password);
        btnSubmit.click();

    }

    public void contactSupport() throws InterruptedException {
        Thread.sleep(5000);
        userIcon.get(0).click();
        Thread.sleep(7000);
        btnContact.click();

    }

    public void logout() {
        btnLogOut.get(3).click();
    }

}
