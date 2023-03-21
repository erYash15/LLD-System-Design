import Observable.IphoneObervableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;

public class Store{
    public static void main(String args[]){

        IphoneObervableImpl iphone = new IphoneObervableImpl() ;

        EmailAlertObserverImpl EO1 = new EmailAlertObserverImpl("email@EO1.com", iphone);
        EmailAlertObserverImpl EO2 = new EmailAlertObserverImpl("email@EO2.com", iphone);;

        MobileAlertObserverImpl MO1 = new MobileAlertObserverImpl("email@EO1.com", iphone);
        MobileAlertObserverImpl MO2 = new MobileAlertObserverImpl("email@MO2.com", iphone);

        iphone.add(EO1);
        iphone.add(EO2);
        iphone.add(MO1);
        iphone.add(MO2);

        iphone.setStockCount(5);
        System.out.println("------");
        iphone.setStockCount(0);
        System.out.println("------");
        iphone.setStockCount(5);

    }
}