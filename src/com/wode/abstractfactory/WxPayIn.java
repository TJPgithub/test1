package com.wode.abstractfactory;

import com.wode.Payment;

/**
 * Created by admin on 2020/2/26.
 */
public class WxPayIn implements InPayment {
    @Override
    public void inPayment() {
        System.out.println("微信支付，在国内不需要特殊处理");
    }
}
