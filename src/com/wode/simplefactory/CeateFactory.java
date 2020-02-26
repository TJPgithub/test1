package com.wode.simplefactory;

import com.wode.Payment;

/**
 * Created by admin on 2020/2/26.
 */
public class CeateFactory {
    /**
     * 根据参数类型获得相应的对象
     *
     * @param type
     * @return
     */
    public Payment getPaymentByType(String type) {
        if ("zfb".equalsIgnoreCase(type)) {

            return new ZfbPay();
        }

        if ("wx".equalsIgnoreCase(type)) {

            return new WxPay();
        }

        if ("apple".equalsIgnoreCase(type)) {

            return new ApplePay();
        }

        return null;
    }

    /**
     * 根据class对象获得相应的对象
     *
     * @param clazz
     * @return
     */
    public Payment getPaymentByClass(Class<? extends Payment> clazz) {
        if (null != clazz) {
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
