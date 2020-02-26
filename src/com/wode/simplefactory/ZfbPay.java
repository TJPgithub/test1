package com.wode.simplefactory;

import com.wode.Payment;

/**
 * Created by admin on 2020/2/26.
 */
public class ZfbPay implements Payment {
    @Override
    public void payMsg() {
        System.out.println("支付宝支付");
    }
}
