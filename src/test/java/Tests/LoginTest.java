package Tests;

import org.testng.annotations.Test;
import pages.Homepage;
import pages.Loginpage;

public class LoginTest extends BaseTest{
    @Test
    void login(){
        Homepage home = new Homepage(driver, wait);
        Loginpage loginpage = home.GoToLoginPage();
        loginpage.enterEmailOrPhoneNo("rahulsuthar1329@gmail.com");
        loginpage.submit();
    }
}
