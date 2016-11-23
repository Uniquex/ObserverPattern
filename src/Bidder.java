/**
 * Created by vitz on 09.11.16.
 */
public class Bidder implements Observer {

    private double price;

    @Override
    public void update(double price) {
        this.price = price;
    }

    public String toString()
    {
        return price+"";
    }
}
