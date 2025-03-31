package cn.newbeedaly.developer.dubbo.pay.dto.res;

import cn.newbeedaly.developer.dubbo.pay.dto.BaseDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PayQueryResDTO extends BaseDTO {

    /**
     * 支付ID
     */
    private String payId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 支付状态
     */
    private String payStatus;

}
