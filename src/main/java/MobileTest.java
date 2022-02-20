import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MobileTest {

    @Test
   public void checkMobilePayment(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://next.privat24.ua/mobile");

        By phoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
        driver.findElement(phoneNumber).sendKeys("973879741");

        By amount = By.xpath("//input[@data-qa-node='amount']");
        driver.findElement(amount).sendKeys("250");

        By numberdebitSource = By.xpath("//input[@data-qa-node='numberdebitSource']");
        driver.findElement(numberdebitSource).sendKeys("4552331448138217");

        By expiredebitSource = By.xpath("//input[@data-qa-node='expiredebitSource']");
        driver.findElement(expiredebitSource).sendKeys("0524");

        By cvvdebitSource = By.xpath("//input[@data-qa-node='cvvdebitSource']");
        driver.findElement(cvvdebitSource).sendKeys("926");

        By firstNamedebitSource = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
        driver.findElement(firstNamedebitSource).sendKeys("Taras");

        By lastNamedebitSource = By.xpath("//input[@data-qa-node='lastNamedebitSource']");
        driver.findElement(lastNamedebitSource).sendKeys("Shevchenko");

        By submit = By.xpath("//button[@data-qa-node='submit']");
        driver.findElement(submit).click();
        driver.findElement(By.xpath("//button[contains(text(),'Сплатити')]")).click();

    }



}
