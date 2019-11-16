package pages;

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
    public void clickOn() {
        Actions action = new Actions(browser);
        WebElement button = browser.findElement(By.xpath());
        action.click(button).perform();
    }
}
