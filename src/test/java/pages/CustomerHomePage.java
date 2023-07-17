package pages;

import base.Base;
import org.openqa.selenium.By;

public class CustomerHomePage extends Base {
    public static By customerWelcomeMsg = By.xpath("//h2[2]");

    public static By getCustomerId = By.xpath("//h2[1]");

    public static By orderProductMenu = By.xpath("//a[text()='Order Product']");

    public static By customerProfileMenu = By.xpath("//a[@href='custMyProfile.php?id=4']");
}
