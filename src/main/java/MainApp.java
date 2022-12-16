import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MainApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org");

        // Reccuperation de l'ID de la barre de recherche
        WebElement searchBox = driver.findElement(By.id("searchInput"));
        // Mots a saisir dans la barre de recherche
        String searchStr = "Selenium WebDriver";
        // Envoie des mots dans la barre de recherche
        searchBox.sendKeys(searchStr);

        // Reccuperation du bouton de la barre de recherche
        WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
       // Click sur le bouton recherche avec comme mots saisi "Selenium WebDriver"
        searchButton.click();

//        driver.close();

    }
}
