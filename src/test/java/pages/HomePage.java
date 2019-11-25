package pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By CLICKGO = By.xpath(".//span[@class='gogogo']");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void selectDeparture(String airport) {
        //Find dropdown
        baseFunc.selectByText(FROM, airport);
    }
    public void selectArrival(String airport) {
        baseFunc.selectByText(TO, airport);
        baseFunc.clickOn(CLICKGO);
    }
}
