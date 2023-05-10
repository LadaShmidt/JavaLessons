package Multithreading.CountDownLatch;
import java.util.concurrent.CountDownLatch;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Market market = new Market(countDownLatch);

        Buyer buyer1 = new Buyer("Sergey", countDownLatch);
        Buyer buyer2 = new Buyer("Lada", countDownLatch);
        Buyer buyer3 = new Buyer("Oleg", countDownLatch);
        Buyer buyer4 = new Buyer("Maria", countDownLatch);
        Buyer buyer5 = new Buyer("Olga", countDownLatch);

        market.marketStaffIsOnPlace();
        market.everythingIsReady();
        market.openMarket();
    }
}
