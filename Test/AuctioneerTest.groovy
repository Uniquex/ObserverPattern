/**
 * Created by wvitz on 13.12.2016.
 */
import groovy.util.*;
class AuctioneerTest extends GroovyTestCase {

    void testRegisterObserver() {
        Auctioneer act = new Auctioneer();

        act.registerObserver(new Bidder());

        assert !act.getObserverList().isEmpty()

        shouldFail(){
            act.getObserverList().get(1);
        }
    }

    void testUnregisterObserver() {
        Auctioneer act = new Auctioneer();
        Bidder bidder = new Bidder();
        act.registerObserver(bidder);
        act.unregisterObserver(bidder);

        assert act.getObserverList().isEmpty()

        shouldFail(){
            act.getObserverList().get(0);
        }
    }

    void testNotifyObserver() {
        Auctioneer act = new Auctioneer();
        Bidder bidder = new Bidder();
        act.registerObserver(bidder);

        Auctioneer.updatePrice(200);
        act.notifyObserver();

        assert act.getObserverList().get(bidder).getPrice() == 200
    }

}
