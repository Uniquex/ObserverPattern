import java.util.ArrayList;

/**
 * Created by vitz on 09.11.16.
 */
public class Auctioneer implements Subject{

    private ArrayList<Bidder> observers= new ArrayList<>();
    private double price;

    public void registerObserver(Bidder o){observers.add(o);
    }

    public void unregisterObserver(Observer o){

        int x = observers.indexOf(o)+1;

        System.out.println("Observer #"+x+" was removed.");

        observers.remove(x);
    }

    public void notifyObserver(){
        int x = 0;
        for (Observer obs : observers) {
            x++;
            obs.update(price);
            System.out.println("Observer #"+x+" notified!");
        }
    }

    public void updatePrice(int price){
        this.price = price;
        this.notifyObserver();
    }

    public void printObserverdetails(){
        int x=0;
        for(Observer obs : observers){
            x++;
            System.out.println("Observer #"+x+" Status: "+obs.toString());
        }
    }
}
