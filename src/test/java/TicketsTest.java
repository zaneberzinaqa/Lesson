import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.BookingPage;
import pages.HomePage;
import pages.SeatsPage;

public class TicketsTest {
   @Test
   public void ticketsTest() {
      //open browser
      //maximize window
      BaseFunc baseFunc = new BaseFunc();
      //go to url
      baseFunc.goToUrl("qaguru.lv:8089/tickets");
      //select departure
      HomePage homePage = new HomePage(baseFunc);
      homePage.selectDeparture("RIX");
      //select destination
      homePage.selectArrival("SVO");
      //click gogogo
      //fill in fields
      BookingPage bookingPage = new BookingPage(baseFunc);
      bookingPage.type("Zane", "Bērziņa", "0", "no", "no");
      //click get price
      //click book
      SeatsPage seatsPage = new SeatsPage(baseFunc);
      //select seat
      //click book
      //check thank you page
      //close browser
      baseFunc.closeBrowser();
   }
}
