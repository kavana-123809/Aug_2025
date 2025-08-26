package com.orangehrm.tests;

import com.orangehrm.pages.Login_PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class LoginOrangeHRM {

    WebDriver driver;
    Login_PageFactory loginPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage = new Login_PageFactory(driver);
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        // Add assertion here
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"Admin", "admin123"},
            {"geeta", "apple"},
            {"hema", "welcome"}
        };
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
