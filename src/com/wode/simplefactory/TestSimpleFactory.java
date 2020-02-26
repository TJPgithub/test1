package com.wode.simplefactory;

import com.wode.Payment;

/**
 * Created by admin on 2020/2/26.
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        CeateFactory factory = new CeateFactory();
        /*简单工厂模式1*/
        Payment payment = factory.getPaymentByType("zfb");
        payment.payMsg();
        payment = factory.getPaymentByType("wx");
        payment.payMsg();
        payment = factory.getPaymentByType("apple");
        payment.payMsg();

        System.out.println("--------------------------华丽丽的分割线-----------------------------");
        /*简单工厂模式2*/
        payment = factory.getPaymentByClass(ZfbPay.class);
        payment.payMsg();
        payment = factory.getPaymentByClass(WxPay.class);
        payment.payMsg();
        payment = factory.getPaymentByClass(ApplePay.class);
        payment.payMsg();
    }

}
