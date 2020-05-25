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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class TestRegistroFailedTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void registroEmpty() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("registerSubmit")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(1)")).getText(), is("The Email field is required."));
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).getText(), is("The Password field is required."));
    driver.close();
  }
  @Test
  public void registroEmptyEmail() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Pass1234$");
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Pass1234$");
    driver.findElement(By.id("registerSubmit")).click();
    {
      WebElement element = driver.findElement(By.id("registerSubmit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".text-danger li")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The Email field is required."));
    driver.close();
  }
  @Test
  public void registroEmptyPass() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("correo@correo.com");
    driver.findElement(By.id("registerSubmit")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The Password field is required."));
  }
  @Test
  public void registroPasswordBadLength() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("correo@correo.com");
    driver.findElement(By.id("Input_Password")).sendKeys("Pass");
    driver.findElement(By.cssSelector(".col-md-4")).click();
    assertThat(driver.findElement(By.id("Input_Password-error")).getText(), is("The Password must be at least 6 and at max 100 characters long."));
    driver.close();
  }
  @Test
  public void registroPasswordDistinta() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("correo@correo.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Pass1234$");
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Pass234$");
    {
      WebElement element = driver.findElement(By.id("registerSubmit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.id("registerSubmit"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".form-group:nth-child(6)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("registerForm")).click();
    driver.findElement(By.cssSelector(".col-md-4")).click();
    assertThat(driver.findElement(By.cssSelector(".form-group:nth-child(6)")).getText(), is("Confirm password\nThe password and confirmation password do not match."));
  }
  @Test
  public void registroPasswordLowerCaseLetters() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("correo@correo.com");
    driver.findElement(By.id("Input_Password")).sendKeys("12345$$");
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("12345$$");
    driver.findElement(By.id("registerSubmit")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(1)")).getText(), is("Passwords must have at least one lowercase (\'a\'-\'z\')."));
    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).getText(), is("Passwords must have at least one uppercase (\'A\'-\'Z\')."));
    driver.close();
  }
  @Test
  public void registroPasswordNotAlphanumerical() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("correo@correo.com");
    driver.findElement(By.id("Input_Password")).sendKeys("Pass1234");
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Pass1234");
    driver.findElement(By.id("registerSubmit")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Passwords must have at least one non alphanumeric character."));
    driver.close();
  }
  @Test
  public void registroPasswordNumbers() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("correo@correo.com");
    driver.findElement(By.id("Input_Password")).sendKeys("Pass$$");
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Pass$$");
    driver.findElement(By.id("registerSubmit")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Passwords must have at least one digit (\'0\'-\'9\')."));
    driver.close();
  }
  @Test
  public void registroPasswordUpperCase() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("correo@correo.com");
    driver.findElement(By.id("Input_Password")).sendKeys("pass1234$");
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("pass1234$");
    driver.findElement(By.id("registerSubmit")).click();
    driver.findElement(By.cssSelector(".text-danger li")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Passwords must have at least one uppercase (\'A\'-\'Z\')."));
    driver.close();
  }
  @Test
  public void registroRepeatedEmail() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("correo@correo.com");
    driver.findElement(By.id("Input_Password")).sendKeys("Pass1234$");
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Pass1234$");
    driver.findElement(By.id("registerSubmit")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("User name \'correo@correo.com\' is already taken."));
    driver.close();
  }
}
