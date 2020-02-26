package com.wode.factorymethod;

import com.wode.Payment;

/**
 * Created by admin on 2020/2/26.
 */
public class WxPayFactory implements CreateFactoryMethod {
    @Override
    public Payment create() {
        return new WxPay();
    }
}
