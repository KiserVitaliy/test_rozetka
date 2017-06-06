import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ElectronicsPage {

    private final WebDriver driver;

    public ElectronicsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToPhonesPage() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='menu_categories_left']/li[1]/h4/a")).click();
    }
}
