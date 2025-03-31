package cn.newbeedaly.developer.order.adaptor.pay;

import cn.newbeedaly.developer.order.adaptor.config.DefaultFeignClientConfiguration;
import cn.newbeedaly.developer.order.adaptor.pay.vo.res.PaymentResVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pay", contextId = "PayFeignClient",
        path = "/pay", configuration = DefaultFeignClientConfiguration.class)
public interface PayFeignClient {

    @GetMapping({"/pay/{key}"})
    PaymentResVO getPaymentById(@PathVariable("key") String key);

}
