package com.wode.abstractfactory;

/**
 * Created by admin on 2020/2/26.
 */
public class ZfbPayOut implements OutPayment {
    @Override
    public void outPayment() {
        System.out.println("支付宝，在国外需要特殊处理");
    }
}
