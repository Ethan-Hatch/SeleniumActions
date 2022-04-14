import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Map;

public class TestScript {
    static WebDriver driver;

    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
//        for (String envName : env.keySet()) {
//            //System.out.println(envName + ": " + env.get(envName));
//            System.out.format("%s=%s%n", envName, env.get(envName));
//        }
//
//        System.out.println();
//        System.out.println(System.getenv("USERDOMAIN"));
//        ChromeOptions options = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);

    }
}
