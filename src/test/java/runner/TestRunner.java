package runner;

import com.github.javafaker.Faker;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utils.Setup;
import utils.Utils;

import java.io.IOException;

public class TestRunner extends Setup {
    MyAccountPage myAccountPage;
    @Test (priority = 1, description = "User creation")
    public void createAccount() throws InterruptedException, IOException, ParseException {
        myAccountPage=new MyAccountPage(driver);
        Thread.sleep(5000);
        Faker faker =new Faker();
        String fName= faker.name().firstName();
        String lName= faker.name().lastName();
        String phone= "(555) 555-5555";
        String email= fName+ Utils.generateRandomNumber(100,999) +"@yopmail.com";
        String password= "@sdF1234";
        myAccountPage.createAccount(fName,lName,phone,email,password);
        Thread.sleep(5000);
        Utils.addJsonArray(email,password);
        myAccountPage.logout();
        Thread.sleep(7000);
    }
   @Test(priority = 2, description = "Checking Contact button")
    public void checkContact() throws InterruptedException {
        myAccountPage =new MyAccountPage(driver);
        myAccountPage.contactSupport();

        //Assertion
        String ActualText= driver.findElement(By.className("customerSupportColor")).getText();
        String ExpectedText="Customer Support";
        Assert.assertTrue(ActualText.contains(ExpectedText));

    }

    @Test(priority = 3, description = "Login with Invalid user information")
    public void  invalidUser_Login() throws InterruptedException, IOException, ParseException {
        myAccountPage = new MyAccountPage(driver);
        myAccountPage.doLogin("asdF@yopmail.com", "asdF1234");
        Thread.sleep(1500);
    }
    @Test(priority = 4, description = "Login with valid user information")
    public void  validUser_Login() throws InterruptedException, IOException, ParseException {
        myAccountPage = new MyAccountPage(driver);
        JSONObject userObject = Utils.loadJSONFileContainingArray("./src/test/resources/User.json", 0);
        Thread.sleep(7000);
        String email = userObject.get("Email").toString();
        String password = userObject.get("Password").toString();
        myAccountPage.doLogin(email, password);
        Thread.sleep(1500);
        myAccountPage.logout();
    }
}
