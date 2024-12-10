package cn.newbeedaly.developer.dubbo.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderPayCallbackController extends OrderBaseController {

    Logger logger = LoggerFactory.getLogger(OrderPayCallbackController.class);

    @GetMapping("/pay/callback")
    public Boolean payCallback() {
        logger.info("订单中心：接收支付回调通知，回调成功");
        return Boolean.TRUE;
    }
}
