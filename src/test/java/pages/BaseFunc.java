package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseFunc {
    private WebDriver browser;

    public BaseFunc() {
        System.setProperty("webdriver.chromedriver.browser", "C:/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }
    public void goToUrl(String url) {
        if (url.startsWith("http://") || url.startsWith("https://")) {

        } else {
            url = "http://" + url;
        }
        browser.get(url);
    }
    public void selectByText(By locator, String text) {
        Select select = new Select(browser.findElement(locator));
        select.deselectByVisibleText(text);
    }
    public void clickOn(By locator) {
        Actions action = new Actions(browser);
        WebElement button = browser.findElement(locator);
        action.click(button).perform();
    }
    public boolean isElementPresent(By locator){
        return browser.findElements(locator).isEmpty();
    }
    public void type(By locator, String text) {
        Assertions.assertFalse(isElementPresent(locator), "No element here");
        WebElement we = browser.findElement(locator);
        WebElement.clear();
        we.sendKeys(text);
    }
    public void closeBrowser() {
        browser.close();
    }
}
