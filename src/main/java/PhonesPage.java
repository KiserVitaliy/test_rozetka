import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PhonesPage {

    private final WebDriver driver;

    public PhonesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void applyFilterDualSimPhones() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='menu_categories_left']/li[2]/ul/li[1]/a")).click();
    }
}
