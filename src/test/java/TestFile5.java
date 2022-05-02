import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFile5
{
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    //    public String baseUrl = "https://www.lambdatest.com/";
    private String UT_ID_U = System.getenv("UT_ID_username");
    private String UT_ID_P = System.getenv("UT_ID_password");

    @BeforeClass
    public void testSetup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        js = (JavascriptExecutor) driver;
    }

    @BeforeMethod
    public void openBrowser() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://google.com");
        //driver.get("https://test-mybenefits.dts.utah.gov/EligibilityLookupTool/");
        System.out.println("~~~~~~~~~~~");
        System.out.println("Current URL ----> " + driver.getCurrentUrl());
        System.out.println("~~~~~~~~~~~");
    }


    @Test
    public void test1() {

        System.out.println();
        System.out.println("CURRENT URL ----> " + driver.getCurrentUrl());
        System.out.println("PAGE TITLE ----> " + driver.getTitle());
//        System.out.println("PAGE SOURCE ----> " + driver.getPageSource());
        driver.close();
    }
}