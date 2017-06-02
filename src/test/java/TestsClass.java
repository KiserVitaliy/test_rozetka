import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class TestsClass {

    private WebDriver driver;
    private Actions actions;
    private WebElement element;
    private List<WebElement> topRated, productDescription, productPrice;


    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void findFirst() {
        driver.get("http://rozetka.com.ua/");
        driver.findElement(By.xpath("//*[@id='3361']/a")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='menu_categories_left']/li[1]/h4/a")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='menu_categories_left']/li[2]/ul/li[1]/a")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        topRated = driver.findElements(By.cssSelector("i[name='prices_active_element_original']"));
        productDescription = driver.findElements(By.cssSelector(".g-i-tile-i-title.clearfix>a"));
        productPrice = driver.findElements(By.cssSelector(".g-price-uah"));

        System.out.println("Start to find elements");
        System.out.println("topRated " + topRated.size());
        System.out.println("productDescription " + productDescription.size());
        System.out.println("productPrice " + productPrice.size());
        System.out.println("Stop to find elements");

        int counter = 0;
        for (WebElement element: topRated) {
            if (element.getAttribute("class").toString().contains("g-tag g-tag-icon-middle-popularity sprite")) {
                System.out.println("Advertisment");
                System.out.println(productDescription.get(counter).getText());
                System.out.println(productPrice.get(counter).getText());

            }
            counter ++;
        }










        //driver.findElement(By.xpath("")); //Top rated
        //List list = driver.findElements(By.xpath("//*[@id='rso']/div[2]/div/div/h3/a"));
        //for(WebElement element:list)         {
        //    System.out.println(element.getText());
        //}

    }

}
