package ru.stat.mkstat;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class SelectYear {
    ChromeDriver wd;
  GenerateData genData;

    @BeforeMethod
    public void setUp() throws Exception {



        //ChromeOptions options = new ChromeOptions();
       // options.addArguments("start-maximized");
       // wd = new ChromeDriver(options);
       // wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      //  wd.get("http://192.168.50.45/");
      //  login("admin", "master");
     // genData = new GenerateData();

        //System.setProperty("webdriver.chrome.driver", "/Users/artur/Desktop/buildAgent/chromedriver");
        System.setProperty("webdriver.chrome.driver", "\\Project\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        /// options.addArguments("start-fullscreen");
        wd = new ChromeDriver(options);
      wd.get("http://192.168.50.45/");;
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    private void login(String username, String password) {
        wd.findElement(By.id("#login-username")).click();
        wd.findElement(By.id("#login-username")).clear();
        wd.findElement(By.id("#login-username")).sendKeys(username);
        wd.findElement(By.id("#login-password")).click();
        wd.findElement(By.id("#login-password")).clear();
        wd.findElement(By.id("#login-password")).sendKeys(password);
        wd.findElement(By.id("#btn-login")).click();
    }

    @Test
    public void testSelect17year() {

     gotoДанныеCтатистики();
      selectГод();
     clickПоиск();
     new WebDriverWait(wd, 20).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[title='Данные не загружены']")));





      wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
      wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
      wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")).click();
      wd.findElement(By.xpath("//*[@id=\"StatEditor\"]/div[2]/div[2]/div[2]/button[2]")).click();



     assertTrue(wd.findElement(By.xpath("//*[@id=\"StatEditor\"]/div[3]/div/div[1]/div/uib-accordion[1]/div/div")).getText().contains("Раздел"));




      wd.findElement(By.xpath("//*[@id=\"StatEditor\"]/div[2]/div[2]/div[1]/button[2]")).click();
      wd.findElement(By.cssSelector("button.btn.btn-warning")).click();



       // wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/input")).sendKeys("(064) Форма");
       // assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("6"));
        //wd.findElement(By.cssSelector("i.ui-grid-icon-cancel")).click();

        ///wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[3]/div[2]/div[2]/div/div/input")).sendKeys("Калин");
        ///assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("2"));
        ///wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[3]/div[2]/div[2]/div/div/div/i")).click();

       ///wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[4]/div[2]/div[2]/div/div/input")).sendKeys("321000");
       ///assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("4"));
       ///wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[4]/div[2]/div[2]/div/div/div/i")).click();


       ///wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[5]/div[2]/div[2]/div/div/input")).sendKeys("Тестовое");
      ///assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("6"));
      ///wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[5]/div[2]/div[2]/div/div/div/i")).click();

      //wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[6]/div[2]/div[2]/div/div/select")).click();
     // wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[6]/div[2]/div[2]/div/div/select/option[9]")).click();
      //assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("1"));
     // wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[6]/div[2]/div[2]/div/div/div/i")).click();

      //wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[7]/div[2]/div[2]/div/select")).click();
      //wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[7]/div[2]/div[2]/div/select/option[3]")).click();
      //assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("2"));
      //wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[7]/div[2]/div[2]/div/div/div/i")).click();

      ///  wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[8]/div[2]/div[2]/div/div/select")).click();
      /// wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[8]/div[2]/div[2]/div/div/select/option[2]")).click();
      ///  assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("2"));
      ///   wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[8]/div[2]/div[2]/div/div/div/i")).click();

      /// wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[9]/div[2]/div[2]/div/div/input")).sendKeys("31.03");
      ///  assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("1"));
      /// wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[9]/div[2]/div[2]/div/div/div/i")).click();

      ///  wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[10]/div[2]/div[2]/div/div/select")).click();
      /// wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[10]/div[2]/div[2]/div/div/select/option[2]")).click();
      /// assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("2"));
      ///  wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[10]/div[2]/div[2]/div/div/div/i")).click();

      ///   wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[11]/div[2]/div[2]/div/div/select")).click();
      /// wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[11]/div[2]/div[2]/div/div/select/option[2]")).click();
      /// assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("1"));


      /// wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[12]/div[2]/div[2]/div/div/select")).click();
      ///    wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[12]/div[2]/div[2]/div/div/select/option[3]")).click();
      ///  assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("1"));


      //wd.findElement(By.linkText("Пользователи")).click();
      //assertTrue(wd.findElement(By.xpath("//div[1]/div/div/div/div/div/div[1]/div[1]/div[1]")).getText().contains(""));
      //assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/div/div/div[2]/div[2]/div/span")).getText().contains("4"));
      //wd.findElement(By.xpath("//div[@id='main_list']/div[2]/div/button")).click();
      //wd.findElement(By.xpath("//input-default[@id='login']/input")).click();
      //wd.findElement(By.xpath("//input-default[@id='login']/input")).clear();
      //wd.findElement(By.xpath("//input-default[@id='login']/input")).sendKeys(genData.generateRandomAlphaNumeric(10));
      //wd.findElement(By.xpath("//input-default[@id='name']/input")).click();
      // wd.findElement(By.xpath("//input-default[@id='name']/input")).clear();
      //wd.findElement(By.xpath("//input-default[@id='name']/input")).sendKeys("АБВГДРК");
      //wd.findElement(By.xpath("//input-default[@id='name']/input")).click();
      // wd.findElement(By.xpath("//input-default[@id='name']/input")).clear();
      //wd.findElement(By.xpath("//input-default[@id='name']/input")).sendKeys("АБВГДРК");
      //wd.findElement(By.xpath("//input-default[@id='email']/input")).click();
      //wd.findElement(By.xpath("//input-default[@id='email']/input")).clear();
      // wd.findElement(By.xpath("//input-default[@id='email']/input")).sendKeys("11111@11.ru");
      //wd.findElement(By.xpath("//input-default[@id='phone']/input")).click();
      //wd.findElement(By.xpath("//input-default[@id='phone']/input")).clear();
      //wd.findElement(By.xpath("//input-default[@id='phone']/input")).sendKeys("+7 (777) 777-7777");
      //wd.findElement(By.xpath("//input-password[@id='password']/input")).click();
      // wd.findElement(By.xpath("//input-password[@id='password']/input")).clear();
      //wd.findElement(By.xpath("//input-password[@id='password']/input")).sendKeys("1234567");
      //wd.findElement(By.xpath("//div[@class='modal-content']//button[.='Сохранить11']")).click();
     // wd.findElement(By.xpath("//input-default[@id='q']/input")).click();
     // wd.findElement(By.xpath("//input-default[@id='q']/input")).sendKeys("КВЕРТИ");
      //wd.findElement(By.xpath("//div[@id='main_list']/div[1]/div/div[3]/div/button[1]")).click();
     // wd.findElement(By.xpath("//div[.='КВЕРТИ']")).click();
     // new Actions(wd).doubleClick(wd.findElement(By.xpath("//input-default[@id='q']/input"))).build().perform();


     // wd.findElement(By.linkText("Формы")).click();
      //assertTrue(wd.findElement(By.xpath("//div[@id='1492605827843-0-uiGrid-000D-cell")).getText().contains(""));







    }




    private void selectГод() {
        wd.findElement(By.cssSelector("option[value='number:2017']")).isSelected();
        wd.findElement(By.cssSelector("option[value='number:2017']")).click();
    }

    private void clickПоиск() {
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();

     }

    private void gotoДанныеCтатистики() {
        wd.findElement(By.linkText("Данные статистики")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
