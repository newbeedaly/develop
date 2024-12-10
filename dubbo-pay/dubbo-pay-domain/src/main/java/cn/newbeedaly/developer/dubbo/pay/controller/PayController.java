package cn.newbeedaly.developer.dubbo.pay.controller;

import cn.newbeedaly.developer.dubbo.pay.dto.res.PayQueryResDTO;
import cn.newbeedaly.developer.dubbo.pay.service.PayService;
import cn.newbeedaly.developer.dubbo.pay.vo.req.PaymentReqVO;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class PayController extends PayBaseController {

    Logger logger = LoggerFactory.getLogger(PayController.class);

    @Reference
    private PayService payService;

    @GetMapping(value = "/pay/{payId}")
    public PayQueryResDTO getPayInfoByOrderId(@PathVariable("payId") String payId) {
        logger.info("支付中心：查询支付信息, 支付id {}", payId);
        return payService.getPayById(payId);
    }

    /**
     * 发起支付
     */
    @PostMapping("/pay")
    public Boolean pay(@Validated @RequestBody PaymentReqVO pay) {
        logger.info("支付中心：发起支付, 商户:{}, 订单号: {}, 订单支付中", pay.getMerchantId(), pay.getOrderId());
        return Boolean.TRUE;
    }
}
