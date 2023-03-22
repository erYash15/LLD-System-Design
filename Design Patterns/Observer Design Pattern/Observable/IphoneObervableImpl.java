package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObervableImpl implements StocksObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) { observerList.add(observer); }

    @Override
    public void remove(NotificationAlertObserver observer) { observerList.remove(observer); }

    @Override
    public void notifySubscriber() {

        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }

    }

    @Override
    public void setStockCount(int newStockAdded) {
        stockCount = newStockAdded;
        if (stockCount > 0){
            notifySubscriber();
        }
        else{
            System.out.println("Stocks: 0, No Notification Sent");
        }

    }

    public int getStockCount() {
        return stockCount;
    }
}
