package com.wode.abstractfactory;

/**
 * Created by admin on 2020/2/26.
 */
public class ZfbPay implements AllPayment {
    @Override
    public InPayment createInPayment() {
        return new ZfbPayIn();
    }

    @Override
    public OutPayment createOutPayment() {
        return new ZfbPayOut();
    }
}
