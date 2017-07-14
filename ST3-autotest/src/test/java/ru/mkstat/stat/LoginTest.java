package ru.mkstat.stat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;




public class LoginTest { ChromeDriver wd;





  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "/Users/artur/Desktop/buildAgent/chromedriver");
    //System.setProperty("webdriver.chrome.driver", "\\Project\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    wd = new ChromeDriver(options);
    baseUrl = "http://192.168.50.45/";
    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    wd.get("http://192.168.50.45/");
    wd.findElement(By.id("login-password")).clear();
    wd.findElement(By.id("login-password")).sendKeys("master");
    wd.findElement(By.id("login-username")).clear();
    wd.findElement(By.id("login-username")).sendKeys("admin");
    wd.findElement(By.id("btn-login")).click();
    wd.findElement(By.linkText("Данные статистики")).click();

  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

    }
  }



