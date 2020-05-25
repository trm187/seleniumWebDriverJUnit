package org.ual.hmis.blancorobles;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.BrowserVersion;
public class TestCambioContraseaFailedTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	System.setProperty("webdriver.gecko.driver", "selenium-drivers/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	FirefoxOptions firefoxOptions = new FirefoxOptions();
	firefoxOptions.setHeadless(true);
	ChromeOptions ChromeOptions = new ChromeOptions();
	ChromeOptions.setHeadless(true);
    //driver = new ChromeDriver(ChromeOptions);
driver = new FirefoxDriver(firefoxOptions);
	driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_68,true);


    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
  //Con el driver de Firefox hay que comentar el driver.quit() o peta
	 //driver.quit();
  }
  @Test
  public void changePasswordNumbers() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("Password12/");
    driver.findElement(By.id("Input_NewPassword")).click();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("Password/");
    driver.findElement(By.id("Input_ConfirmPassword")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Password/");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Passwords must have at least one digit (\'0\'-\'9\')."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void changePasswordNotSame() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("Password12/");
    driver.findElement(By.id("Input_NewPassword")).click();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("Password12/");
    driver.findElement(By.id("Input_ConfirmPassword")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Password123/");
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-primary"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("change-password-form")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(4)")).click();
    assertThat(driver.findElement(By.id("Input_ConfirmPassword-error")).getText(), is("The new password and confirmation password do not match."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void changePasswordNotAlphanumerical() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("Input_Password")).sendKeys(Keys.ENTER);
    try {
    	Thread.sleep(1000);
    }catch(InterruptedException e) {
    	e.printStackTrace();
    }
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("Password12/");
    driver.findElement(By.cssSelector(".form-group:nth-child(3)")).click();
    driver.findElement(By.id("Input_NewPassword")).click();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("Password12");
    driver.findElement(By.id("Input_ConfirmPassword")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Password12");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector(".text-danger li")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Passwords must have at least one non alphanumeric character."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.cssSelector(".container:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Log out"));
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void changePasswordNewEmpty() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("Password12/");
    driver.findElement(By.id("Input_ConfirmPassword")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Contrasena12/");
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-primary"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".form-group:nth-child(4)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("change-password-form")).click();
    driver.findElement(By.cssSelector(".col-md-6")).click();
    assertThat(driver.findElement(By.id("Input_ConfirmPassword-error")).getText(), is("The new password and confirmation password do not match."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void changePasswordNewConfirmEmpty() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("Password12/");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector(".text-danger li")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The New password field is required."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void changePasswordLowerCase() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("Password12/");
    driver.findElement(By.id("Input_NewPassword")).click();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("password12/");
    driver.findElement(By.id("Input_ConfirmPassword")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("password12/");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector(".text-danger li")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Passwords must have at least one uppercase (\'A\'-\'Z\')."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void changePasswordEmpty() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("Input_Password")).sendKeys(Keys.ENTER);
    try {
    	Thread.sleep(1000);
    }catch(InterruptedException e) {
    	e.printStackTrace();
    }
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(1)")).getText(), is("The Current password field is required."));
    driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).getText(), is("The New password field is required."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void changePasswordCurrentEmpty() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_NewPassword")).click();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("Contrasena12/");
    driver.findElement(By.id("Input_ConfirmPassword")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Contrasena12/");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The Current password field is required."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
  @Test
  public void changePasswordConfirmEmpty() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("Password12/");
    driver.findElement(By.id("Input_NewPassword")).click();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("Contrasena12/");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn-primary"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The new password and confirmation password do not match."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.cssSelector(".container:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Log out"));
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.close();
  }
  @Test
  public void changePasswordBadLength() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello user2@example.com!")).click();
    driver.findElement(By.id("change-password")).click();
    driver.findElement(By.id("Input_OldPassword")).click();
    driver.findElement(By.id("Input_OldPassword")).sendKeys("Password12/");
    driver.findElement(By.id("Input_NewPassword")).click();
    driver.findElement(By.id("Input_NewPassword")).sendKeys("Pa12/");
    driver.findElement(By.cssSelector(".form-group:nth-child(4)")).click();
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Pa12/");
    driver.findElement(By.cssSelector(".btn-primary")).click();
    driver.findElement(By.cssSelector(".text-danger li")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The New password must be at least 6 and at max 100 characters long."));
    driver.findElement(By.cssSelector(".btn-link")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
}
