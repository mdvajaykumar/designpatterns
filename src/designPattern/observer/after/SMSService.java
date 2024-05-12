package designPattern.observer.after;

public class SMSService implements OrderPlacedSubscriber {


    public SMSService(FlipKart flipKart){
        flipKart.addSubscriber(this);
    }
    public void sendSMS(String to, String body) {
        System.out.println(
                "Sending SMS to " + to + " with body: " + body
        );
    }


    @Override
    public void onOrderPlaced(Order order) {
        sendSMS(order.customerPhoneNumber, "Your order is placed successfully.");
    }
}
