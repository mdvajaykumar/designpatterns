package designPattern.adapter;

import designPattern.adapter.thirdparty.RazorpayPG;

public class RazorpayPGAdapter implements PaymentGatewayInterface{

    RazorpayPG razorpayPG = new RazorpayPG();
    @Override
    public void initiate(String orderNumber) {
        razorpayPG.initiatePayment("12345");
    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }
}
