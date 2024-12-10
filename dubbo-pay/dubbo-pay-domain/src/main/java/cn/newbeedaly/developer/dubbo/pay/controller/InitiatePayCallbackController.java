package cn.newbeedaly.developer.dubbo.pay.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitiatePayCallbackController extends PayBaseController {

    Logger logger = LoggerFactory.getLogger(InitiatePayCallbackController.class);

    @GetMapping("/payCallback")
    public Boolean payCallback() {
        logger.info("支付中心：发起支付回调");
        // 此处一般为Http调用
        return Boolean.TRUE;
    }
}
