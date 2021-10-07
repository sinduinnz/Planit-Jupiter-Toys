// Base Test --Parent class that will be extended by child class.
package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.LoginPage;

public class BaseTest {
  
  protected ChromeDriver driver;
  private final String HomeURL = "https://jupiter.cloud.planittesting.com/#/";
  protected LoginPage loginPage;
  
  @BeforeClass
  public void setUp () throws Exception {
       System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver\\chromedriver.exe");
		   driver = new ChromeDriver();
		   System.out.println(" Opening Jupiter Toys Home Page\n");
		   driver.get(HomeURL); 
       loginPage = new LoginPage(driver);
  }
  @AfterClass
  public void tearDown () throws Exception {
    driver.quit();
  }
}
