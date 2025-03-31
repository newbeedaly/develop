package cn.newbeedaly.developer.dubbo.pay.controller;

import cn.newbeedaly.developer.dubbo.pay.dto.res.PayQueryResDTO;
import cn.newbeedaly.developer.dubbo.pay.service.PayService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController extends PayBaseController {

    Logger logger = LoggerFactory.getLogger(PayController.class);

    @Reference
    private PayService payService;

    @GetMapping(value = "/{payId}")
    public PayQueryResDTO getPayInfoByPayId(@PathVariable("payId") String payId) {
        logger.info("支付中心：查询支付信息, 支付id {}", payId);
        return payService.getPayById(payId);
    }

}
