package pages;

import org.openqa.selenium.By;

public class SeatsPage {
    private BaseFunc baseFunc;
    private final By SEATNO7 = By.xpath(".//div[@onclick='seat(7)']");
    private final By BOOK = By.xpath(".//span[@class = 'bookBtn']");
}
