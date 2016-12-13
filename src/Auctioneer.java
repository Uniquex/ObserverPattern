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
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }

    /**
     * Removal of specified Observer
     * @param o Observer to remove
     */
    @Override
    public void unregisterObserver(Observer o){
        //System.out.println("Observer #" + observers.indexOf(o) + " was removed.");

        if(observers.contains(o)) {
            observers.remove(o);
        }
        else
        {
            System.out.println("Object not in the observerlist");
        }
    }

    /**
     * Notify Observer Objects that are specified in the ArrayList
     */
    @Override
    public void notifyObserver(){
        int x = 0;
        for (Observer obs : observers) {
            x++;
            obs.update(price);
            //System.out.println("Observer #"+x+" notified!");
        }
    }

    /**
     * Update the current price of the auctioned item
     * @param price defined price to update
     */
    @Override
    public void updatePrice(double price){
        this.price = price;
        this.notifyObserver();
    }

    /**
     * Print observer status (their current price)
     * mothod used to check the price their are currently holding
     */
    @Override
    public void printObserverdetails(){
        int x=0;
        for(Observer obs : observers){
            x++;
            System.out.println("Observer #"+x+" Status: "+obs.toString());
        }
    }


    /**
     * Returns Arraylist holding all Observers
     * @return
     */
    public ArrayList<Observer> getObserverList(){
        return this.observers;
    }
}
