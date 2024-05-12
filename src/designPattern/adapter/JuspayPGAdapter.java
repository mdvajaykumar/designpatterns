package designPattern.adapter;

import designPattern.adapter.thirdparty.JuspayPG;

public class JuspayPGAdapter implements PaymentGatewayInterface{

JuspayPG juspayPG = new JuspayPG();
    @Override
    public void initiate(String orderNumber) {
//        juspayPG.beginPayment("1234");  need to pass UUID
    }

    @Override
    public boolean checkStatus(String orderNumber) {
        return false;
    }


}
