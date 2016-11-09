import java.util.ArrayList;

/**
 * Created by vitz on 09.11.16.
 */
public class Auctioneer implements Subject{

    private ArrayList<Observer> observers= new ArrayList<>();
    private double price;

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void unregisterObserver(Observer o){

        int x = observers.indexOf(o);

        System.out.println("Observer #"+x+" was removed.");

        observers.remove(x);
    }

    public void notifyObserver(){
        for (Observer obs : observers) {
            obs.update(price);
        }
    }
}
