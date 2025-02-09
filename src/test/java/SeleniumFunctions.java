import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFunctions {

Logger log=AppLoggingUtil.getLogger(SeleniumFunctions.class);
    private WebDriver driver;

    public void launchHomepage(String lauchURL) {
        driver = new ChromeDriver();
        driver.get(lauchURL);
        log.info("Launched the URL");
    }

    public void ClickOnElement(String locator) {
        driver.findElement(By.xpath(locator)).click();
        log.info("Clicked on the element");
    }

    public void sendKeys(String locator, String name) {
        driver.findElement(By.xpath(locator)).sendKeys(name);
    }

    public void mouseHoverTo(String locator) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(locator)));
        driver.close();
    }

    public String getElementText(String locator) {
        return driver.findElement(By.xpath(locator)).getText();
    }

    public void selectDropDown(String locator, String value) {
        Select dropdown = new Select(driver.findElement(By.xpath(locator)));
        dropdown.selectByValue(value);
    }

    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

}
