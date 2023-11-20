package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl {
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    public void update() {
        sendMail(userName, "product is currently in stock, hurry up!");
    }

    private void sendMail(String userName, String msg) {
        System.out.println("email sent to: " + userName);

        // Send the actual message to end user.
    }
}
