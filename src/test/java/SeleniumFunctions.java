import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumFunctions {


    private WebDriver driver;

    public void launchHomepage(String lauchURL) {
        driver = new ChromeDriver();
        driver.get(lauchURL);
    }


    public void ClickOnElement(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    public void sendKeys(String locator, String name) {
        driver.findElement(By.xpath(locator)).sendKeys(name);
    }


    public void mouseHoverTo(String locator) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(locator)));
    }

    public void closeBrowser() {
        driver.close();
    }

}
