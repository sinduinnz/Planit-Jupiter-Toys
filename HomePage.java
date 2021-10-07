//HomePage.java

package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage extends BasePage {
  
  private By fullNameField = By.id("name");
  private By passwordField = By.id("password");
  private By loginButton = By.id("login");
  
  public HomePage (WebDriver driver) {
    super(driver);
  }
  
  public void setFullName (String fullName) {
    type(fullName, fullNameField);
  }
  public void setPassword (String password) {
    type(password, passwordField);
  }
  public HomePage clickLoginButton () {
    click(loginButton);
    return new HomePage(driver);
  }
}
