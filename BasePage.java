//Base Page - Super Class with common actions that will be used across other Page Objects.

package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BasePage {
  
  protected WebDriver driver;
  
  //Constructor designed to accept a WebDriver driver parameter
  public BasePage (WebDriver driver) {
    this.driver = driver;
  }
  
  //Find method reduces code duplication.
  //By Locator parameter accepts a Selenium locator such as id,Xpath,CSS Selector
  protected WebElement find (By locator) {
    return driver.findElement(locator);
  }
  
  // Enters data into a field using the SendKeys method.
  //String Text Parameter receives data.By locator receieves a Selenium locator.
  protected void type (String text, By locator) {
    find(locator).sendKeys(text);
  }
  
  protected void click (By locator) {
    find(locator).click();
  }
}
