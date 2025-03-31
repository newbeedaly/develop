package cn.newbeedaly.developer.pay.api.client;

import cn.newbeedaly.developer.pay.api.vo.res.PaymentResVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface PayClient {

    /**
     * 查询支付信息
     *
     * @param key 支付ID
     * @return 支付信息
     */
    @GetMapping("/pay/{key}")
    PaymentResVO getPaymentById(@PathVariable("key") String key);

}
