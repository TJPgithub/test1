package com.wode.abstractfactory;

/**
 * Created by admin on 2020/2/26.
 */
public class ApplePay implements AllPayment {
    @Override
    public InPayment createInPayment() {
        return new ApplePayIn();
    }

    @Override
    public OutPayment createOutPayment() {
        return new ApplePayOut();
    }
}
