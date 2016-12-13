
import org.junit.Test;
import groovy.util.*;

class AuctioneerTest extends GroovyTestCase {

    @Test
    void testRegisterObserver() {
        Auctioneer act = new Auctioneer();
        act.registerObserver(new Bidder());

        assert !act.getObserverList().isEmpty()

        shouldFail IndexOutOfBoundsException, {
            act.getObserverList().get(1);
        }

    }

    @Test
    void testUnregisterObserver() {
        Auctioneer act = new Auctioneer();
        Bidder bidder = new Bidder();
        act.registerObserver(bidder);
        act.unregisterObserver(bidder);

        assert act.getObserverList().isEmpty()

        shouldFail IndexOutOfBoundsException, {
            act.getObserverList().get(0);
        }
    }

    @Test
    void testNotifyObserver() {
        Auctioneer act = new Auctioneer();
        Bidder bidder = new Bidder();
        act.registerObserver(bidder);
        act.updatePrice(200);
        act.notifyObserver();

        assert act.getObserverList().get(act.getObserverList().indexOf(bidder)).getPrice() == 200
    }

}
