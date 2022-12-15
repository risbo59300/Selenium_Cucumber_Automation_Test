import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.wikipedia.org");

        //Locators
        //id
        Long start = System.currentTimeMillis();
        driver.findElement(By.id("js-link-box-fr"));
        Long end = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by ID is : " + (end - start));

        //Xpath
        Long start1 = System.currentTimeMillis();
        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
        Long end1 = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by Xpath is : " + (end1 - start1));

        //Css
        Long start2 = System.currentTimeMillis();
        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang2"));
        Long end2 = System.currentTimeMillis();

        System.out.println("The time needed to get a locator by CssSelector is : " + (end2 - start2));

        driver.close();

    }
}
