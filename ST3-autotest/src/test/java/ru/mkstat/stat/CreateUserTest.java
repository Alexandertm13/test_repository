package ru.mkstat.stat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class CreateUserTest { ChromeDriver wd;

  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();


  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {

   System.setProperty("webdriver.chrome.driver", "\\Project\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions(); //1
   options.addArguments("--start-maximized");
  //options.addArguments("start-fullscreen");
    wd = new ChromeDriver(options);
    baseUrl = "http://192.168.50.45/";
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    wd.get("http://192.168.50.45/");
    wd.findElement(By.id("login-username")).clear();
    wd.findElement(By.id("login-username")).sendKeys("admin");
    wd.findElement(By.id("login-password")).clear();
    wd.findElement(By.id("login-password")).sendKeys("master");
    wd.findElement(By.id("btn-login")).click();
    wd.findElement(By.linkText("Пользователи")).click();
      Thread.sleep(1000);
    wd.findElement(By.xpath("//div[@id='main_list']/div[2]/div/button")).click();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[1]/input")).click();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[1]/input")).clear();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[1]/input")).sendKeys(GeneralData.generateRandomAlphaNumeric(10));
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[3]/input")).click();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[3]/input")).clear();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[3]/input")).sendKeys(GeneralData.generateRandomAlphaNumeric(10));
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[5]/input")).click();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[5]/input")).clear();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[5]/input")).sendKeys("11111@11.ru");
    wd.findElement(By.xpath("//*[@id=\"dropdown\"]/button/span[2]")).click();
    wd.findElement(By.xpath("//html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/div[1]/div[2]/ul/li[1]/span")).click();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[6]/input")).click();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[6]/input")).clear();
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[2]/label[6]/input")).sendKeys("8(777)7777777");
    wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/div/div[3]/div/div/div[3]/div/button[2]")).click();
    Thread.sleep(1000);
  }



  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

    }
  }


