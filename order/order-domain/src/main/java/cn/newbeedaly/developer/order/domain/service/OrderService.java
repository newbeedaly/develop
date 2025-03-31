package cn.newbeedaly.developer.order.domain.service;

import javax.validation.constraints.NotNull;

/**
 * @author newbeedaly
 */
public interface OrderService {

    String getPayId(@NotNull String orderId);

}
