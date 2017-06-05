import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class TestsClass {

    private WebDriver driver;
    private StartPage startPage;
    private ElectronicsPage electronicsPage;
    private PhonesPage phonesPage;
    private DualSimFilterPage1 dualSimFilterPage1;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        startPage = new StartPage(driver);
        electronicsPage = new ElectronicsPage(driver);
        phonesPage = new PhonesPage(driver);
        dualSimFilterPage1 = new DualSimFilterPage1(driver);
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void findThreeDevicesOnFirstPage() {

        startPage.openRozetka();
        startPage.goToElectronicsPage();
        electronicsPage.goToPhonesPage();
        phonesPage.applyFilterDualSimPhones();
        dualSimFilterPage1.showFirstThreeDevices();

    }
}
