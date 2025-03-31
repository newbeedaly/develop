package cn.newbeedaly.developer.order.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface OrderClient {

    @GetMapping(value = "/{orderId}")
    String getOrder(@PathVariable("orderId") String orderId);

    @GetMapping("/pay/{key}")
    String getPayByOrderId(@PathVariable("key") String orderId);
}
