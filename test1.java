//test1 

package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
public class FormTest extends BaseTest {
  
  @Test
  public void logIntoTestProjectExamplePage () {
  
    homePage.setFullName("Rex Jones II");
    homePage.setPassword("12345");
    ContactPage contact_page = homePage.clickLoginButton();
    contact_page.
    Assert.assertTrue(formPage.getConfirmationMessage().equals("Saved"));
  }
}
