package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String emailId, StocksObservable observable ){
        this.observable = observable;
        this.username = emailId;
    }

    @Override
    public void update(){
        sendMsg(username, "product is in stock hurry up");
    }

    public void sendMsg(String username, String msg){
        System.out.println("msg sent to Mobile: " + username + ", MSG: " + msg);
    }

}
