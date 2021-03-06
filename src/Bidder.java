/**
 * Created by vitz on 09.11.16.
 */

/**
 * Bidder implementation of the Observer class
 */
public class Bidder implements Observer {

    private double price;
    private String name;

    /**
     * Constructor of the bidder class
     * @param name Identifier
     */
    public Bidder(String name){
        this.setName(name);
    }
    /**
     * Update the current price of the item
     * invoked by Subject
     * @param price the value price has to be replaced
     */
    @Override
    public void update(double price) {
        this.price = price;
    }

    /**
     * Returns current knowledge of the price the observer class is holding
     * @return string with price
     */
    @Override
    public String toString()
    {
        return "Observer: "+name+" - "+price;
    }

    /**
     * Set an Identifier for the Bidder
     * @param name The name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Returns current value of Bidder
     * @return
     */
    @Override
    public double getPrice(){
        return this.price;
    }
}
