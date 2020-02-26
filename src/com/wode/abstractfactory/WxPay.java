package com.wode.abstractfactory;

/**
 * Created by admin on 2020/2/26.
 */
public class WxPay implements AllPayment {
    @Override
    public InPayment createInPayment() {
        return new WxPayIn();
    }

    @Override
    public OutPayment createOutPayment() {
        return new WxPayOut();
    }
}
