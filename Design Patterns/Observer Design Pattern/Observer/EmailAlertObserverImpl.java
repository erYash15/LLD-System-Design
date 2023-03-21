package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationALertObserver {
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable ){

        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update(){
        sendMail(emailId, "product is in stock hurry up");
    }

    public void sendMail(String emailId, string msg){
        System.out.println("mail sent to: " + emailId);
    }

}
