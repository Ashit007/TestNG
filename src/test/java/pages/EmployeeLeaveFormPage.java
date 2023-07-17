package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeLeaveFormPage extends Base {

    public static By leaveReasonLabel = By.xpath("//a[text()='Apply Leave']");

    public static By startDate =  By.name("start");

    public static By endDate = By.name("end");

    public static By submitButton = By.xpath("//button[text()='Submit']");

    public static void employeeLeaveForm() throws InterruptedException {
        sendKeys(EmployeeLeaveFormPage.leaveReasonLabel,"Vacation");
        Thread.sleep(1000);
        sendKeys(EmployeeLeaveFormPage.startDate,"12/23/2023");
        Thread.sleep(1000);
        sendKeys(EmployeeLeaveFormPage.endDate,"12/30/2023");
        Thread.sleep(1000);
        click(EmployeeLeaveFormPage.submitButton);
    }
}
