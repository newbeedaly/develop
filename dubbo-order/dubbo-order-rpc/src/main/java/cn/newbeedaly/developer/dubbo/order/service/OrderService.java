package cn.newbeedaly.developer.dubbo.order.service;

import cn.newbeedaly.developer.dubbo.order.dto.req.OrderQueryReqDTO;

import javax.validation.constraints.NotNull;

/**
 * @author newbeedaly
 */
public interface OrderService {

    String getOrderPayByOrderId(@NotNull OrderQueryReqDTO dto);

    String getPayIdByOrderId(@NotNull String orderId);

}
