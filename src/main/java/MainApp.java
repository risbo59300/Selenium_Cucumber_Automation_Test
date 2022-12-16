import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/FZSM8022/Desktop/table.html");

        // Reccuperation du premier element de la table se trouvant à la ligne 2 et colonne 1
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]")).getText());
        // Reccuperation de l'entête de la table se trouvant à la ligne 1 et colonne 2
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/th[2]")).getText());

        // Reccuperation des éléments de toutes les lignes
        List<WebElement> listOfWebElements = driver.findElements(By.xpath("/html/body/table/tbody/tr"));

        for (WebElement element: listOfWebElements) {
            System.out.println(element.getText());
        }

        driver.close();

    }
}
