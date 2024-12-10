package cn.newbeedaly.developer.pay.api.client;

import cn.newbeedaly.developer.pay.api.vo.req.PaymentReqVO;
import cn.newbeedaly.developer.pay.api.vo.res.PaymentResVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PayClient {

    /**
     * 发起支付
     *
     * @param pay 支付请求信息
     * @return 支付结果
     */
    @PostMapping("/pay")
    Boolean pay(@Validated @RequestBody PaymentReqVO pay);

    /**
     * 查询支付信息
     *
     * @param key 支付ID
     * @return 支付信息
     */
    @GetMapping("/pay/{key}")
    PaymentResVO getPaymentById(@PathVariable("key") String key);

}
