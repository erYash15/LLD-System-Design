package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationALertObserver {
    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable ){

        this.observable = observable;
        this.username = emailId;
    }

    @Override
    public void update(){
        sendMsgonM(emailId, "product is in stock hurry up");
    }

    public void sendMsgonM(String emailId, string msg){
        System.out.println("msg sent to: " + emailId);
    }

}
