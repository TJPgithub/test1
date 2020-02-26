package com.wode.factorymethod;

import com.wode.Payment;

/**
 * Created by admin on 2020/2/26.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        CreateFactoryMethod factory = new ZfbPayFactory();
        Payment payment = factory.create();
        payment.payMsg();

        factory = new WxPayFactory();
        payment = factory.create();
        payment.payMsg();

        factory = new ApplePayFactory();
        payment = factory.create();
        payment.payMsg();
    }
}
