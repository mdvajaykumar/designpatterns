package designPattern.observer.after;



public class InvoiceGenerator implements OrderPlacedSubscriber {


    public InvoiceGenerator(FlipKart flipKart){
        flipKart.addSubscriber(this);
    }
    public void generateInvoice(Long orderId) {
        System.out.println("Generating invoice for order: " + orderId);
    }


    @Override
    public void onOrderPlaced(Order order) {
        generateInvoice(order.orderId);
    }
}
