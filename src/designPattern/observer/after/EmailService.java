package designPattern.observer.after;



public class EmailService implements OrderPlacedSubscriber{


    public EmailService(FlipKart flipKart){
        flipKart.addSubscriber(this);
    }
    void sendEmail(String to, String body) {
        System.out.println(
                "Sending email to " + to + " with body: " + body
        );
    }


    @Override
    public void onOrderPlaced(Order order) {
        sendEmail(order.customerEmail, "Your order is placed successfully.");
    }
}