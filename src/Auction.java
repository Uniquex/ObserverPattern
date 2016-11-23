/**
 * Created by vitz on 09.11.16.
 */
public class Auction {

    public static void main(String[] args){
        Subject auctioneer = new Auctioneer();
        Bidder fam = new Bidder();
        auctioneer.registerObserver(new Bidder());
        auctioneer.registerObserver(fam);
        auctioneer.registerObserver(new Bidder());

        auctioneer.updatePrice(200);
        //auctioneer.printObserverdetails();

        auctioneer.updatePrice(250);
        //auctioneer.printObserverdetails();

        auctioneer.unregisterObserver(fam);
        //auctioneer.printObserverdetails();
        auctioneer.updatePrice(300);


    }

}
