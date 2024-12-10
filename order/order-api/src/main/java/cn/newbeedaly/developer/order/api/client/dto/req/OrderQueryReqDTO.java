package cn.newbeedaly.developer.order.api.client.dto.req;

import javax.validation.constraints.NotBlank;

public class OrderQueryReqDTO {

    /**
     * 订单ID
     */
    @NotBlank(message = "订单ID不能不能为空")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
