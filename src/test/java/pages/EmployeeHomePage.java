package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeHomePage extends Base {
    public static By employeeWelcomeMsg = By.xpath("//h2[contains(text(),'Welcome Test')]");

    public static By getEmployeeId = By.xpath("//h2[text()='Employee Id: 102 ']");

    public static By employeeLeaveStatus = By.xpath("//h2[text()='Leave Satus']");
    public static By employeeProfileMenu = By.xpath("//a[text()='My Profile']");

    public static By productOrderMenu = By.xpath("//a[text()='Product Order']");

    public static By employeeLeaveMenu = By.xpath("//a[@href='applyleave.php?id=102']");


}
