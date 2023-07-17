package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeLoginPage extends Base {
    public static By employeeLogin = By.linkText("Employee Login");

    public static By employeeUserId = By.xpath("//input[@name='mailuid']");

    public static By employeePassword = By.xpath("//input[@name='pwd']");

    public static By loginButton = By.xpath("//input[@name='login-submit']");

    public static By employeeInvalidUserid = By.id("error-msg");


    public static void loginAsEmployee() {

        sendKeys(EmployeeLoginPage.employeeUserId, "testpilot@gmail.com");

        sendKeys(EmployeeLoginPage.employeePassword, "1234");

        click(EmployeeLoginPage.loginButton);

    }
}


