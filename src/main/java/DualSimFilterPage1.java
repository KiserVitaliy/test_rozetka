import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DualSimFilterPage1 {

    private final WebDriver driver;
    private List<WebElement> topSale, productDescription, productPrice;
    private int i = 0;
    private int j = 1;

    public DualSimFilterPage1(WebDriver driver) {
        this.driver = driver;
    }

    public void showFirstThreeDevices(){

        //add elements to lists
        topSale = driver.findElements(By.cssSelector("i[name='prices_active_element_original']"));
        productDescription = driver.findElements(By.cssSelector(".g-i-tile-i-title.clearfix>a"));
        productPrice = driver.findElements(By.cssSelector(".g-price-uah"));

        //check Top Sale and add Description and Price info to map
        for (WebElement element: topSale) {
            if (element.getAttribute("class").toString().contains("g-tag g-tag-icon-middle-popularity sprite") && j <= 3) {
                System.out.println("# " + j);
                System.out.println("Model: " + productDescription.get(i).getText());
                System.out.println("Price: " + productPrice.get(i).getText());
                j++;
            }
            i++;
        }
    }
}
