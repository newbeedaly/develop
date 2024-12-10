package cn.newbeedaly.developer.dubbo.pay.dto.req;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@Setter
public class PayReqDTO extends BaseDTO {

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

}
