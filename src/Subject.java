/**
 * Created by vitz on 09.11.16.
 */
//Auktionär

public interface Subject {
    void registerObserver(Bidder o);
    void unregisterObserver(Observer o);
    void notifyObserver();
    void updatePrice(int Price);
    void printObserverdetails();

}
