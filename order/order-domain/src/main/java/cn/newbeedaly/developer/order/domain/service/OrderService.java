package cn.newbeedaly.developer.order.domain.service;

import cn.newbeedaly.developer.order.api.client.dto.req.OrderQueryReqDTO;

import javax.validation.constraints.NotNull;

/**
 * @author newbeedaly
 */
public interface OrderService {

    String getOrderPayByOrderId(@NotNull OrderQueryReqDTO dto);

    String getPayIdByOrderId(@NotNull String orderId);

}
