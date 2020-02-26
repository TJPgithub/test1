package com.wode.abstractfactory;

/**
 * Created by admin on 2020/2/26.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AllPayment payment = new ZfbPay();
        InPayment inPayment = payment.createInPayment();
        inPayment.inPayment();
        OutPayment outPayment = payment.createOutPayment();
        outPayment.outPayment();

        payment = new WxPay();
        inPayment = payment.createInPayment();
        inPayment.inPayment();
        outPayment = payment.createOutPayment();
        outPayment.outPayment();

        payment = new ApplePay();
        inPayment = payment.createInPayment();
        inPayment.inPayment();
        outPayment = payment.createOutPayment();
        outPayment.outPayment();
    }
}
