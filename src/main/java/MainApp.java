
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.time.Duration;
import java.util.logging.Logger;


public class MainApp {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.wikipedia.org");

        WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));

        String titleText = titleOfWebPage.getText();
        String expectedText = "Wikipedia";

        if (titleText.equals(expectedText)) {
            System.out.println("Test has passed !");
        }
        else {
            System.out.println("Test did not pass !");
            driver.close();
            throw new Exception();
        }

        driver.close();

    }
}
