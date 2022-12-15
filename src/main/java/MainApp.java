import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainApp {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org");
        WebElement frenchButton = driver.findElement(By.id("js-link-box-fr"));

        frenchButton.click();

        String expectedTitle = "Wikipédia";
        WebElement titleOfFrenchPage = driver.findElement(By.cssSelector("#accueil_2017_contenu > div.portail-droite > div:nth-child(1) > p:nth-child(2) > a:nth-child(1)"));

        if (titleOfFrenchPage.getText().equals(expectedTitle)) {
            System.out.println("Test has passed! Page is the French one");
        }
        else {
            System.out.println("Test has failed! Click() was not successful.");
        }


        driver.close();

    }
}
