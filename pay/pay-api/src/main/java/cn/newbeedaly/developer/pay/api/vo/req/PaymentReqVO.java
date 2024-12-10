package cn.newbeedaly.developer.pay.api.vo.req;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class PaymentReqVO implements Serializable {

    @NotEmpty(message = "商户号不能为空")
    private String merchantId;
    @NotEmpty(message = "订单号不能为空")
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
