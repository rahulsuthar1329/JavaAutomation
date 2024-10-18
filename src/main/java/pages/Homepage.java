package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends BasePage {
    public static String loginButton = "a[title='Login']";

    public Homepage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public Homepage(WebDriver driver, WebDriverWait wait, Actions action){
        super(driver, wait, action);
    }

    public Loginpage GoToLoginPage() {
        findElementByCssSelector(loginButton).click();
        return new Loginpage(driver, wait);
    }
}








