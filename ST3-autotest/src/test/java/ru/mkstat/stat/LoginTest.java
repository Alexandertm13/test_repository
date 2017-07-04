package ru.mkstat.stat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://192.168.50.45/";
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("http://192.168.50.45/");
    driver.findElement(By.id("login-password")).clear();
    driver.findElement(By.id("login-password")).sendKeys("master");
    driver.findElement(By.id("login-username")).clear();
    driver.findElement(By.id("login-username")).sendKeys("admin");
    driver.findElement(By.id("btn-login")).click();
    driver.findElement(By.linkText("Данные статистики")).click();

  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();

    }
  }



