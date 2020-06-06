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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
public class TestLoginFailedTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
//	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setHeadless(true);
		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.setHeadless(true);
	    driver = new ChromeDriver(ChromeOptions);
	    //driver = new FirefoxDriver(firefoxOptions);
		//driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_68,true);


    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
   //Con firefox hay que comentarlo o peta
	 //driver.quit();
  }
  @Test
  public void loginBad() {
    driver.get("https://practicaselenium.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user3@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Contrasena12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Invalid login attempt."));
    driver.close();
  }
  @Test
  public void loginBadEmail() {
    driver.get("https://practicaselenium.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user3@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.cssSelector(".text-danger > ul")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Invalid login attempt."));
    driver.close();
  }
  @Test
  public void loginBadPassword() {
    driver.get("https://practicaselenium.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("passwordrandom");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.cssSelector(".text-danger li")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Invalid login attempt."));
    driver.close();
  }
  @Test
  public void loginEmailEmpty() {
    driver.get("https://practicaselenium.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.cssSelector(".text-danger li")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The Email field is required."));
    driver.close();
  }
  @Test
  public void loginEmpty() {
    driver.get("https://practicaselenium.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.cssSelector(".text-danger li:nth-child(1)")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(1)")).getText(), is("The Email field is required."));
    driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).getText(), is("The Password field is required."));
    driver.close();
  }
  @Test
  public void loginPasswordEmpty() {
    driver.get("https://practicaselenium.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.id("login-submit")).click();
    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The Password field is required."));
    driver.close();
  }
}



//package org.ual.hmis.blancorobles;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.junit.Assert.assertThat;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.junit.After;
//import org.junit.Before;
//// Generated by Selenium IDE
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//public class TestLoginFailedTest {
//  private WebDriver driver;
//  private Map<String, Object> vars;
//  JavascriptExecutor js;
//  @Before
//  public void setUp() {
//		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//
//		ChromeOptions ChromeOptions = new ChromeOptions();
//		ChromeOptions.setHeadless(true);
//	    driver = new ChromeDriver(ChromeOptions);
//	    js = (JavascriptExecutor) driver;
//    vars = new HashMap<String, Object>();
//  }
//  @After
//  public void tearDown() {
//    driver.quit();
//  }
//  @Test
//  public void loginBad() {
//    driver.get("https://practicaselenium.azurewebsites.net/");
//    driver.manage().window().setSize(new Dimension(1900, 1020));
//    driver.findElement(By.linkText("Login")).click();
//    driver.findElement(By.id("Input_Email")).click();
//    driver.findElement(By.id("Input_Email")).sendKeys("user3@example.com");
//    driver.findElement(By.id("Input_Password")).click();
//    driver.findElement(By.id("Input_Password")).sendKeys("Contrasena12/");
//    driver.findElement(By.id("login-submit")).click();
//    driver.findElement(By.cssSelector(".text-danger > ul")).click();
//    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Invalid login attempt."));
//    driver.close();
//  }
//  @Test
//  public void loginBadEmail() {
//    driver.get("https://practicaselenium.azurewebsites.net/");
//    driver.manage().window().setSize(new Dimension(1900, 1020));
//    driver.findElement(By.linkText("Login")).click();
//    driver.findElement(By.id("Input_Email")).click();
//    driver.findElement(By.id("Input_Email")).sendKeys("user3@example.com");
//    driver.findElement(By.id("Input_Password")).click();
//    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
//    driver.findElement(By.id("login-submit")).click();
//    driver.findElement(By.cssSelector(".text-danger > ul")).click();
//    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Invalid login attempt."));
//    driver.close();
//  }
//  @Test
//  public void loginBadPassword() {
//    driver.get("https://practicaselenium.azurewebsites.net/");
//    driver.manage().window().setSize(new Dimension(1900, 1020));
//    driver.findElement(By.linkText("Login")).click();
//    driver.findElement(By.id("Input_Email")).click();
//    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
//    driver.findElement(By.id("Input_Password")).click();
//    driver.findElement(By.id("Input_Password")).sendKeys("passwordrandom");
//    driver.findElement(By.id("login-submit")).click();
//    driver.findElement(By.cssSelector(".text-danger li")).click();
//    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Invalid login attempt."));
//    driver.close();
//  }
//  @Test
//  public void loginEmailEmpty() {
//    driver.get("https://practicaselenium.azurewebsites.net/");
//    driver.manage().window().setSize(new Dimension(1900, 1020));
//    driver.findElement(By.linkText("Login")).click();
//    driver.findElement(By.id("Input_Password")).click();
//    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
//    driver.findElement(By.id("login-submit")).click();
//    driver.findElement(By.cssSelector(".text-danger li")).click();
//    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The Email field is required."));
//    driver.close();
//  }
//  @Test
//  public void loginEmpty() {
//    driver.get("https://practicaselenium.azurewebsites.net/");
//    driver.manage().window().setSize(new Dimension(1900, 1020));
//    driver.findElement(By.linkText("Login")).click();
//    driver.findElement(By.id("login-submit")).click();
//    driver.findElement(By.cssSelector(".text-danger li:nth-child(1)")).click();
//    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(1)")).getText(), is("The Email field is required."));
//    driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).click();
//    assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).getText(), is("The Password field is required."));
//    driver.close();
//  }
//  @Test
//  public void loginPasswordEmpty() {
//    driver.get("https://practicaselenium.azurewebsites.net/");
//    driver.manage().window().setSize(new Dimension(1900, 1020));
//    driver.findElement(By.linkText("Login")).click();
//    driver.findElement(By.id("Input_Email")).click();
//    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
//    driver.findElement(By.id("login-submit")).click();
//    assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("The Password field is required."));
//    driver.close();
//  }
//}
