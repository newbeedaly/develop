package cn.newbeedaly.developer.order.adaptor.pay;

import cn.newbeedaly.developer.order.adaptor.pay.vo.req.PaymentReqVO;
import cn.newbeedaly.developer.order.adaptor.pay.vo.res.PaymentResVO;
import cn.newbeedaly.developer.order.adaptor.config.DefaultFeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "pay", contextId = "PayFeignClient",
        path = "/pay", configuration = DefaultFeignClientConfiguration.class)
public interface PayFeignClient {

    @PostMapping({"/pay"})
    Boolean pay(@Validated @RequestBody PaymentReqVO pay);

    @GetMapping({"/pay/{key}"})
    PaymentResVO getPaymentById(@PathVariable("key") String key);

}
