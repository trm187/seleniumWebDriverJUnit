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
public class TestRegistroValidoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.setHeadless(true);
	    driver = new ChromeDriver(ChromeOptions);
	    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void registroValidologinlogout() {
    driver.get("https://practicaselenium.azurewebsites.net/");
    vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
    vars.put("pass", js.executeScript("return \"Password1234$\""));
    System.out.println(vars.get("emailrandom").toString());
    System.out.println(vars.get("pass").toString());
    driver.manage().window().setSize(new Dimension(1294, 1400));
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.id("Input_ConfirmPassword")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.cssSelector(".pb-3")).click();
    driver.findElement(By.id("registerSubmit")).click();
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Register confirmation"));
    driver.findElement(By.id("confirm-link")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
    driver.findElement(By.id("Input_Password")).sendKeys(vars.get("pass").toString());
    driver.findElement(By.id("login-submit")).click();
    driver.findElement(By.linkText("Hello" + vars.get("emailrandom").toString()+"!")).click();
    driver.findElement(By.id("personal-data")).click();
    driver.findElement(By.cssSelector("#download-data > .btn")).click();
    driver.close();
  }
}
