//test1 

package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
public class FormTest extends BaseTest {
  @Test
  public void logIntoTestProjectExamplePage () {
    loginPage.setFullName("Rex Jones II");
    loginPage.setPassword("12345");
    HomePage home_page = loginPage.clickLoginButton();
    formPage.completeForm(
            "United States",
            "1234 TestProject",
            "Rex.Jones@Test4Success.org",
            "214-225-1234");
    Assert.assertTrue(formPage.getConfirmationMessage().equals("Saved"));
  }
}
