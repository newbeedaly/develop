package cn.newbeedaly.developer.order.adaptor.pay.vo.req;

import java.io.Serializable;

public class PaymentReqVO implements Serializable {

    private String merchantId;
    private String orderId;
    private Integer payAmount;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

}
