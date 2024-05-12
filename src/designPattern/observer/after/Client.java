package designPattern.observer.after;

public class Client {

    public static void main(String[] args) {

//     one way
//        FlipKart flipkart = new FlipKart();
//        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
//        EmailService emailService = new EmailService();
//        SMSService smsService = new SMSService();
//        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();
//
//        flipkart.addSubscriber(invoiceGenerator);
//        flipkart.addSubscriber(emailService);
//        flipkart.addSubscriber(smsService);
//        flipkart.addSubscriber(inventoryManagementSystem);



//        Another way

        FlipKart flipkart = new FlipKart();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);
        EmailService emailService = new EmailService(flipkart);
        SMSService smsService = new SMSService(flipkart);
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem(flipkart);



    }

}
