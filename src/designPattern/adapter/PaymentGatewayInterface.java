package designPattern.adapter;

public interface PaymentGatewayInterface {
    void initiate(String orderNumber);

    boolean checkStatus(String orderNumber);
}
