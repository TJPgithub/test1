package com.wode.abstractfactory;

/**
 * Created by admin on 2020/2/26.
 */
public class ApplePayOut implements OutPayment {
    @Override
    public void outPayment() {
        System.out.println("苹果支持，在国外不需要经过特殊处理的");
    }
}
