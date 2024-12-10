package cn.newbeedaly.developer.pay.api.vo.res;

public class PaymentResVO {

    /**
     * 支付ID
     */
    private String id;
    /**
     * 商户ID
     */
    private String merchantId;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 支付金额
     */
    private Integer payAmount;
    /**
     * 支付状态
     */
    private String payStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
}
