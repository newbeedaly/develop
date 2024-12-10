package cn.newbeedaly.developer.order.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface OrderClient {

    @GetMapping(value = "/{orderId}")
    String getPayInfoByOrderId(@PathVariable("orderId") String orderId);

}
