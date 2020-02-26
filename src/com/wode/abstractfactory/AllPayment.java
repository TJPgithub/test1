package com.wode.abstractfactory;

/**
 * Created by admin on 2020/2/26.
 * 支持总接口
 */
public interface AllPayment {
    InPayment createInPayment();

    OutPayment createOutPayment();
}
