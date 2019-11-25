package pages;

import org.openqa.selenium.By;

public class SeatsPage {
    private BaseFunc baseFunc;
    private final By SEATNO7 = By.xpath(".//div[@onclick='seat(7)']");
    private final By BOOK = By.xpath(".//span[@class = 'bookBtn']");

    public SeatsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void clickOn(By locator) {
        baseFunc.clickOn(SEATNO7);
        baseFunc.clickOn(BOOK);
    }
}

