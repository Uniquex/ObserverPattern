import java.util.ArrayList;

/**
 * Created by vitz on 09.11.16.
 *
 * class for the auctioneer of the Auction
 */
public class Auctioneer implements Subject{

    private ArrayList<Observer> observers= new ArrayList<>();
    private double price;

    /**
     * Add Observer to the ArrayList
     * @param o Observer to add
     */
    public void registerObserver(Observer o){
        observers.add(o);
    }

    /**
     * Removal of specified Observer
     * @param o Observer to remove
     */
    public void unregisterObserver(Observer o){

        int x = observers.indexOf(o)+1;

        System.out.println("Observer #"+x+" was removed.");

        observers.remove(x);
    }

    /**
     * Notify Observer Objects that are specified in the ArrayList
     */
    public void notifyObserver(){
        int x = 0;
        for (Observer obs : observers) {
            x++;
            obs.update(price);
            System.out.println("Observer #"+x+" notified!");
        }
    }

    /**
     * Update the current price of the auctioned item
     * @param price defined price to update
     */
    public void updatePrice(double price){
        this.price = price;
        this.notifyObserver();
    }

    /**
     * Print observer status (their current price)
     * mothod used to check the price their are currently holding
     */
    public void printObserverdetails(){
        int x=0;
        for(Observer obs : observers){
            x++;
            System.out.println("Observer #"+x+" Status: "+obs.toString());
        }
    }
}
