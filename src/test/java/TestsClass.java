import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class TestsClass {

    private WebDriver driver;
    private Actions actions;
    private WebElement element;
    private List<WebElement> elements;
    private Map<String, String> topRated;

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

        elements = driver.findElements(By.xpath("//*[@id='catalog_goods_block']/div/div/div[1]/div/div[1]/div[2]/div/div/i"));
        topRated = new HashMap<String, String>();

        System.out.println(elements.size());

        for (WebElement element: elements){
            if (element.getAttribute("class").contains("g-tag g-tag-icon-middle-popularity sprite")){
                System.out.println("element found");
                topRated.put(driver.findElement(By.xpath("//*[@id='catalog_goods_block']/div/div/div[1]/div/div[1]/div[2]/div[4]/a")).getText(),
                        driver.findElement(By.xpath("//*[@id='catalog_goods_block']/div/div/div/div/div[1]/div[2]/div[5]/div/div/div")).getText());

            }

        }
        for (Map.Entry<String, String> entry : topRated.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue();
            System.out.println("Model: " + key + ", Price: " + value);
        }

        //driver.findElement(By.xpath("")); //Top rated
        //List list = driver.findElements(By.xpath("//*[@id='rso']/div[2]/div/div/h3/a"));
        //for(WebElement element:list)         {
        //    System.out.println(element.getText());
        //}

    }

}
