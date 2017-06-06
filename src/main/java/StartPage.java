import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage {


    private final WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRozetka() {
        driver.get("http://rozetka.com.ua/");
    }

    public void goToElectronicsPage() {
        driver.findElement(By.xpath("//*[@id='3361']/a")).click();
    }
}
