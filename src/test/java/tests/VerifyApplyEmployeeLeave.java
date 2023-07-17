package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeHomePage;
import pages.EmployeeLeaveFormPage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class VerifyApplyEmployeeLeave extends Base {

   @Test

    public void applyEmployeeLeave() throws InterruptedException {
        navigate("http://it.microtechlimited.com");

        click(LandingPage.menuLoginButton);

        EmployeeLoginPage.loginAsEmployee();

        click(EmployeeHomePage.employeeLeaveMenu);

        EmployeeLeaveFormPage.employeeLeaveForm();

        String actualValue = getText(EmployeeHomePage.employeeLeaveStatus);

        Assert.assertEquals(actualValue,"Leave Satus");
    }


}
