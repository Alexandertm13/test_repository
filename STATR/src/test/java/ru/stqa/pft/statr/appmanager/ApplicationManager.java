package ru.stqa.pft.statr.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by artur.petin on 27.09.2016.
 */
public class ApplicationManager {
//    FirefoxDriver wd;
    FirefoxDriver wd;

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
       wd = new FirefoxDriver();
       // wd = new ChromeDriver();
        wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        wd.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
        wd.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        wd.get("http://stat5066.mkstat.ru");
        login("admin", "master");

    }

    private void login(String username, String password) {
        wd.findElement(By.id("login-username")).click();
        wd.findElement(By.id("login-username")).clear();
        wd.findElement(By.id("login-username")).sendKeys(username);
        wd.findElement(By.id("login-password")).click();
        wd.findElement(By.id("login-password")).clear();
        wd.findElement(By.id("login-password")).sendKeys(password);
        wd.findElement(By.id("btn-login")).click();
    }
    public void goToLogs() {
        wd.findElement(By.cssSelector("li.ng-scope:nth-child(6) > a:nth-child(1)")).click();
    }
    public void goToFormGroup() {
        wd.findElement(By.cssSelector("li.ng-scope:nth-child(8) > a:nth-child(1)")).click();
    }
    public void goToSourceGroup() {
        wd.findElement(By.cssSelector("li.ng-scope:nth-child(7) > a:nth-child(1)")).click();
    }
    public void vereficryCurrentSituatuin(){
        wd.findElement(By.xpath("//givc-stat-grid-status")).getText();
    }
    public void goToDictionaryKOPUK() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)")).click();
    }
    public void goToDictionary() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
    }
    public void goToStatus() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)")).click();
    }
    public void goToUsersGroup() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();
    }
    public void goToUsers() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
    }
    public void goToStatistics() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
    }
    public void goToCurrentSituation() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
    }
    public void goToFormPage() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
    }
    public void goToReportGenerator() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
    }
    public void goToKonstkuktorZaprosovPage() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
    }
    public void ZapolnenieKonstuktorZaprosov() {
        if (!wd.findElement(By.xpath("//div[@class='params-wrapper']//select[.='2010201120122013201420152016']//option[7]")).isSelected()) {
            wd.findElement(By.xpath("//div[@class='params-wrapper']//select[.='2010201120122013201420152016']//option[7]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_form_direction']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_form_direction']//option[3]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_form_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_form_name']//option[2]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_part_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_part_name']//option[2]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_graph_name']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_graph_name']//option[3]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_row_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_row_name']//option[2]")).click();
        }
        wd.findElement(By.cssSelector("button.btn:nth-child(2)")).click();
    }
    public void chistca() {
        wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[3]/div/button[2]")).click();
    }
    public void  zapolnenie() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[39]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[39]")).click();
        }
        wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[3]/div/button[1]")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[3]/div")).click();
        wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")).click();
        wd.findElement(By.xpath("//div[2]/div/h4/a/span/div")).click();
        // Дописать измениние
        wd.findElement(By.xpath("//div[@class='modal-footer']//button[.='Сохранить и Проверить']")).click();
        wd.findElement(By.xpath("//div[@class='modal-header']/div[1]/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[1]/div/div/div[3]/button[2]")).click();
    }
    public void proverka() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[2]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka1() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[3]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka2() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[4]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[4]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka3() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[5]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[5]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka4() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[6]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[6]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka5() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[7]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[7]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka6() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[8]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka7() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[9]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[9]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka8() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[10]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[10]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka9() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[11]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[11]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka10() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[12]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[12]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka11() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[13]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[13]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka12() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[14]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[14]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka13() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[15]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[15]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka14() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[16]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[16]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka15() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[17]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[17]")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void zapolnenieKostrukroZaprosov() {
        if (!wd.findElement(By.xpath("//div[@class='params-wrapper']//select[.='2010201120122013201420152016']//option[7]")).isSelected()) {
            wd.findElement(By.xpath("//div[@class='params-wrapper']//select[.='2010201120122013201420152016']//option[7]")).click();
        }
        wd.findElement(By.cssSelector("button.pull-left")).click();;
        if (!wd.findElement(By.xpath("//select[@id='filter_form_direction']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_form_direction']//option[3]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_form_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_form_name']//option[2]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_part_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_part_name']//option[2]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_graph_name']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_graph_name']//option[3]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_row_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_row_name']//option[2]")).click();
        }
        wd.findElement(By.cssSelector("button.btn-xs:nth-child(1)")).click();
        wd.findElement(By.xpath("//div[@class='params-wrapper']//button[.='Запустить запрос']")).click();
    }
    public void IzmenenieUsers() {
        wd.findElement(By.xpath("//input-default[@id='q']/input")).click();
        wd.findElement(By.xpath("//input-default[@id='q']/input")).clear();
        wd.findElement(By.xpath("//input-default[@id='q']/input")).sendKeys("test");
        wd.findElement(By.xpath("//div[@id='main_list']//button[.='Поиск']")).click();
        wd.findElement(By.cssSelector("div.ui-grid-render-container:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")).click();
        wd.findElement(By.xpath("//div[@id='main_list']//button[.='Редактировать']")).click();
        wd.findElement(By.xpath("//input-default[@id='name']/input")).click();
        wd.findElement(By.xpath("//input-default[@id='name']/input")).clear();
        wd.findElement(By.xpath("//input-default[@id='name']/input")).sendKeys("qss");
        wd.findElement(By.xpath("//input-default[@id='email']/input")).click();
        wd.findElement(By.xpath("//input-default[@id='email']/input")).clear();
        wd.findElement(By.xpath("//input-default[@id='email']/input")).sendKeys("efwefdfsf@xgfdsrg.russ");
        wd.findElement(By.xpath("//input-default[@id='phone']/input")).click();
        wd.findElement(By.xpath("//input-default[@id='phone']/input")).clear();
        wd.findElement(By.xpath("//input-default[@id='phone']/input")).sendKeys("" + "88888888888" + (Math.random()));
        wd.findElement(By.xpath("//input-default[@id='position']/input")).click();
        wd.findElement(By.xpath("//input-default[@id='position']/input")).clear();
        wd.findElement(By.xpath("//input-default[@id='position']/input")).sendKeys("32400");
        wd.findElement(By.cssSelector(".modal-footer > button:nth-child(2)")).click();



}
    public void zapolnenie011() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[9]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[9]")).click();
        }
        wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[3]/div/button[1]")).click();
        wd.findElement(By.cssSelector("html/body/div[3]/div[2]")).click();
        wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")).click();
        wd.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        wd.findElement(By.xpath("//div/div/div[2]/div[2]/div/div/div/div/div/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/uib-accordion/div/div/div/h4/a/span/div")).click();
        wd.findElement(By.xpath("//div[2]/div[2]/div[2]/div/div/div/div/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("1");
        wd.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("2");
        wd.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[3]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("3");
        wd.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[4]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("4");
        wd.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[5]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("5");
        wd.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[6]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("6");
        wd.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[7]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("7");
        wd.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[8]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("8");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[9]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("9");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[10]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("10");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[11]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("11");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[12]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("12");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[13]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("13");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[14]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("14");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[15]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("15");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[16]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("16");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[17]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("17");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[18]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("18");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[19]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("19");
        wd.findElement(By.xpath("//div[2]/div/div/div/div[20]/div")).click();
        wd.findElement(By.name("inpInt")).clear();
        wd.findElement(By.name("inpInt")).sendKeys("20");
        wd.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/div[2]/button[2]"));
        wd.findElement(By.xpath("html/body/div[1]/div/div/div/div[2]/div[2]/div[2]/button[1]"));
    }

  public void stop() {
        wd.quit();
    }
}