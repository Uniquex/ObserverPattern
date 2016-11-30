/**
 * Created by vitz on 09.11.16.
 */
public class Auction {

    public static void main(String[] args){
        Subject auctioneer = new Auctioneer();

        auctioneer.registerObserver(new Bidder("Bidder 1"));
        Observer ob = new WebInterface("192.168.1.1");
        auctioneer.registerObserver(ob);
        auctioneer.registerObserver(new Bidder("Bidder 2"));

        auctioneer.updatePrice(200);
        auctioneer.printObserverdetails();

        auctioneer.updatePrice(250.10);
        auctioneer.printObserverdetails();

        auctioneer.unregisterObserver(ob);
        auctioneer.printObserverdetails();
        auctioneer.updatePrice(300);


    }

}
