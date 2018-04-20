
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.soastastore.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCacse() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Store")).click();
    driver.findElement(By.linkText("Tron: Legacy")).click();
    driver.findElement(By.id("product_155_submit_button")).click();
    new Select(driver.findElement(By.name("product_rating"))).selectByVisibleText("2");
    driver.findElement(By.id("s")).clear();
    driver.findElement(By.id("s")).sendKeys("firth");
    driver.findElement(By.id("searchsubmit")).click();
    driver.findElement(By.linkText("The King’s Speech")).click();
    new Select(driver.findElement(By.name("product_rating"))).selectByVisibleText("4");
    driver.findElement(By.id("product_160_submit_button")).click();
    driver.findElement(By.linkText("Checkout")).click();
    driver.findElement(By.cssSelector("input.remove_button")).click();
    driver.findElement(By.cssSelector("span > input[name=\"submit\"]")).click();
    // Warning: assertTextPresent may require manual changes
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
