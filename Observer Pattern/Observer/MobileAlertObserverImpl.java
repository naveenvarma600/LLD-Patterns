package LLD.Concept_And_Coding.L3_Observer_Pattern.Observer;

import LLD.Concept_And_Coding.L3_Observer_Pattern.Observable.StocksObservable;


public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(this.userName, "product is in stock, hurry up!");
    }

    public void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Message sent to: " + userName);
    }
}
