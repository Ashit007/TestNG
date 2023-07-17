package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class Base {
    public static WebDriver driver;

    @BeforeSuite
    public static void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Before Suite");

    }

    @BeforeTest //manage windows
    public void exampleBeforeTest() {

        System.out.println("Before Test");
    }

    @BeforeClass //implicit wait
    public void exampleBeforeClass() {

        System.out.println("Before Class");
    }

    @BeforeMethod //navigate
    public void exampleBeforeMethod() {

        System.out.println("Before Method");
    }

    @AfterMethod //logout
    public void exampleAfterMethod() {

        System.out.println("After Method");
    }

    @AfterClass //delete all cookies
    public void exampleAfterClass() {

        System.out.println("After Class");
    }

    @AfterTest //driver.close
    public void exampleAfterTest() {

        System.out.println("After Test");
    }

    @AfterSuite//driver.quit
    public void tearDown() {

        //driver.close();// to close Current Browser Tab
        driver.quit();// to close Browser Application or Windows
        System.out.println("After Suite");
    }


    public static void navigate(String url) {

        driver.get(url);
    }

    public static String getText(By locator) {

        String s = driver.findElement(locator).getText();
        return s;


    }

    public static void click(By locator) {

        driver.findElement(locator).click();

    }

    public static void sendKeys(By locator, String keys) {

        driver.findElement(locator).sendKeys(keys);
    }

    public static void dropDown(By locator, String value) {

        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }

    public static void clear(By locator){

        driver.findElement(locator).clear();
    }


}


