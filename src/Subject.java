/**
 * Created by vitz on 09.11.16.
 */
//Auktionär

public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObserver();

}
