package com.wode.abstractfactory;

import com.wode.Payment;

/**
 * Created by admin on 2020/2/26.
 */
public class ApplePayIn implements InPayment {
    @Override
    public void inPayment() {
        System.out.println("苹果支持，在国内需要经过特殊处理的");
    }
}
