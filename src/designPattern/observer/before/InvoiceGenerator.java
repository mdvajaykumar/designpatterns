package designPattern.observer.before;

public class InvoiceGenerator {
    public void generateInvoice(Long orderId) {
        System.out.println("Generating invoice for order: " + orderId);
    }
}
