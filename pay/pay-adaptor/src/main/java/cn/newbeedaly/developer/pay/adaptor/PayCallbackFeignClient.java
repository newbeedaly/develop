package cn.newbeedaly.developer.pay.adaptor;

import cn.newbeedaly.developer.pay.adaptor.config.DefaultFeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order", contextId = "PayCallbackFeignClient",
        path = "/order", configuration = DefaultFeignClientConfiguration.class)
public interface PayCallbackFeignClient {

    @GetMapping("/pay/callback")
    Boolean payCallback();

}
