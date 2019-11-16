package pages;

import org.openqa.selenium.By;

public class BookingPage {
    private BaseFunc baseFunc;
    private final By NAMEPLS = By.xpath(".//input[@id='name']");
    private final By SURNAMEPLS = By.xpath(".//input[@id='surname');
    private final By DISCOUNTPLS = By.xpath(".//input[@id='discount']");
    private final By SOMEONE = By.xpath(".//input[@id='adults']");
    private final By CHILDREN = By.xpath(".//input[@id='children']");
    private final By GO = By.xpath(".//span[@class = 'bookBtn']");

    public BookingPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void selectName(String name) {
        baseFunc.selectByText(NAMEPLS).sendKeys("Zane");
    }
    public void select
    public void clickPrice()
}
