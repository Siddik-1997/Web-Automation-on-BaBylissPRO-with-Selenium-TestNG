package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class Utils {

    public static void waitForElement(WebDriver driver, WebElement webElement, int timeunitSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeunitSeconds));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public static JSONObject loadJSONFileContainingArray(String fileLocation, int index) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileLocation));
        JSONArray jsonArray = (JSONArray) obj;
        return (JSONObject) jsonArray.get(index);
    }

    public static void addJsonArray(String email, String password) throws IOException, org.json.simple.parser.ParseException {
        String fileName="./src/test/resources/user.json";
        JSONParser jsonParser=new JSONParser();
        Object obj =jsonParser.parse(new FileReader(fileName));
        JSONObject userObj = new JSONObject();
        JSONArray jsonArray =(JSONArray) obj;

        userObj.put("Email",email);
        userObj.put("Password", password);
        jsonArray.add(userObj);

        FileWriter file=new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();
    }
    public static int generateRandomNumber(int min, int max){
        return (int) Math.round(Math.random()*(max-min)+min);
    }
}
