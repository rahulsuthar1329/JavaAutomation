package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;

    BasePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        this.action = null;
    }

    BasePage(WebDriver driver, WebDriverWait wait, Actions action){
        this.driver = driver;
        this.wait = wait;
        this.action = action;
    }

    public WebElement findElementByCssSelector(String path){
        return driver.findElement(By.cssSelector(path));
    }

    public WebElement findElementById(String path){
        return driver.findElement(By.id(path));
    }

    public WebElement findElementByXPath(String path){
        return driver.findElement(By.xpath(path));
    }

    public void enterValueToInputBox(WebElement element, String value){
        element.sendKeys(value);
    }
}
