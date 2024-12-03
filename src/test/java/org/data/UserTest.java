package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTest {

    private WebDriver driver;
    private User testUser;

    @BeforeClass
    public void setUp() {
        // Set the path for the WebDriver executable (adjust path as needed)
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ka115603\\eclipse-workspace_Keerthana\\CodeCoverage\\Driver\\chromedriver.exe");  //
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Create a test user
        testUser = new User("testuser", "test@example.com", "StrongPass123");
    }

    @Test(priority = 1)
    public void testValidEmail() {
        // Launch a sample form page (use a local HTML file or online form URL)
        driver.get("D:\\Keerthana A\\Working\\testfile.html");

        // Locate email field and submit email
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(testUser.getEmail());
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        // Validate email using User class
        Assert.assertTrue(testUser.isValidEmail(), "Email validation failed.");
    }

    @Test(priority = 2)
    public void testStrongPassword() {
        // Locate password field and submit password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(testUser.getPassword());
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        // Validate password using User class
        Assert.assertTrue(testUser.isStrongPassword(), "Password validation failed.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
