package com.wode.abstractfactory;

/**
 * Created by admin on 2020/2/26.
 */
public class WxPayOut implements OutPayment {
    @Override
    public void outPayment() {
        System.out.println("微信支付，在国外需要特殊处理");
    }
}
