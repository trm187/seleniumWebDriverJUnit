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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class TestLoginValidoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.setHeadless(true);
		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.setHeadless(true);
	    //driver = new ChromeDriver(ChromeOptions);
	    driver = new FirefoxDriver(firefoxOptions);
		//driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_68,true);


    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    //Con firefox hay que comentarlo o peta
	  driver.quit();
  }
  @Test
  public void loginValido() {
    driver.get("https://hmissesion920200514114002.azurewebsites.net/");
    driver.manage().window().setSize(new Dimension(1900, 1020));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("user2@example.com");
    driver.findElement(By.cssSelector(".form-group:nth-child(5)")).click();
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("Password12/");
    driver.findElement(By.id("login-submit")).click();
    assertThat(driver.findElement(By.linkText("Hello user2@example.com!")).getText(), is("Hello user2@example.com!"));
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("HMISSesion9")).click();
    driver.findElement(By.cssSelector(".display-4")).click();
    assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Buenos días!"));
    driver.close();
  }
}
