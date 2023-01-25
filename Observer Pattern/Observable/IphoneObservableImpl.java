package LLD.Concept_And_Coding.L3_Observer_Pattern.Observable;

import java.util.ArrayList;
import java.util.List;

import LLD.Concept_And_Coding.L3_Observer_Pattern.Observer.NotificationAlertObserver;


public class IphoneObservableImpl implements StocksObservable {

    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : notificationAlertObserverList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (newStockAdded > 0 && stockCount == 0) {
            notifySubscribers();
        }

        stockCount = getStockCount() + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
