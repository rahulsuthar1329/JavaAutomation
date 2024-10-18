package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends BasePage {

    public static String inputBox = "//span[text()='Enter Email/Mobile number']/../../input";
    public static String submitButton = "//*[text()='Request OTP']";

    public Loginpage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public Loginpage(WebDriver driver, WebDriverWait wait, Actions action){
        super(driver, wait, action);
    }

    public void enterEmailOrPhoneNo(String value){
        enterValueToInputBox(findElementByXPath(inputBox), value);
    }
    
    public void submit(){
        findElementByXPath(submitButton).click();
    }
}
