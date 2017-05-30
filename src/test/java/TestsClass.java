import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TestsClass {

    private WebDriver driver;
    private Actions actions;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void findFirst() {
        driver.get("http://rozetka.com.ua/");
        driver.findElement(By.xpath(".//*[@id='3361']/a")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='menu_categories_left']/li[1]/h4/a")).click();
        driver.findElement(By.xpath(".//*[@id='menu_categories_left']/li[1]/div/a[1]")).click();
        

    }

}
