package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    public void update() {
        sendMail(emailId, "product is currently in stock, hurry up!");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("email sent to: " + emailId);

        // Send the actual message to end user.
    }
}
