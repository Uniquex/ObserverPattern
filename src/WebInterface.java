/**
 * Created by wvitz on 29.11.2016.
 */

/**
 * implementation of a webinterface
 */
public class WebInterface implements Observer{

    private double price;
    private String ip;

    /**
     * Contstructor of the Webinterface
     * @param ip IP-Address of the Webinterface used as Identifier
     */
    public WebInterface(String ip){
        this.setIP(ip);
    }
    /**
     * Update the current price of the item
     * invoked by Subject
     * @param price the value price has to be replaced
     */
    public void update(double price) {
        this.price = price;
    }

    /**
     * Returns current knowledge of the price the observer class is holding
     * @return string with price
     */
    public String toString()
    {
        return "Observer: "+this.ip+" - "+this.price;
    }

    /**
     * Set the IP-Address
     * @param ip IP-Address
     */
    public void setIP(String ip){
        this.ip = ip;
    }

    /**
     * Returns current value of the Webinterface
     * @return
     */
    @Override
    public double getPrice(){
        return this.price;
    }
}


