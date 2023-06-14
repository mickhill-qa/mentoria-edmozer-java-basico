package mickhill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTeste {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/documentation/");

        By tabPython = By.id("tabs-03-01-tab");

        driver.findElement(tabPython).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
