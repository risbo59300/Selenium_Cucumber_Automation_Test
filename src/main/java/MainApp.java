import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        driver.get("https://www.udemy.com/course/core-java-programming-language-tutorial/");

        // Réccuperation du bouton s'inscrire
        WebElement signUpButton = driver.findElement(By.cssSelector("#fr > div.ud-main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.ud-header.ud-app-loaded > div.ud-text-sm.header--header--1SLKV.header--flex-middle--2QeVR > div:nth-child(9) > a"));

        // Execution du script qui permet de cliquer sur le bouton "s'inscrire" et ouverture de la page d'inscription
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", signUpButton);

        //Setting up timeouts
        ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 1000);");

        // changement de site web et acces au site web de wikipedia
//        ((JavascriptExecutor) driver).executeScript("window.location = 'https://wikipedia.com'");

        //Scrolling de la page web
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)");

//        driver.close();






    }
}
