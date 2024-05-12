package designPattern.adapter;

import designPattern.adapter.thirdparty.CCAvenuePG;

public class CCAvenuePGAdapter implements PaymentGatewayInterface{
   private  CCAvenuePG ccAvenuePG = new CCAvenuePG();
    @Override
    public void initiate(String orderNumber) {
        ccAvenuePG.startPayment("212332");

    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }
}
