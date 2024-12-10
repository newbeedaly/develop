package cn.newbeedaly.developer.pay.domain.controller;

import cn.newbeedaly.developer.pay.api.client.InitiatePayCallbackClient;
import cn.newbeedaly.developer.pay.adaptor.PayCallbackFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitiatePayCallbackController extends PayBaseController implements InitiatePayCallbackClient {

    Logger logger = LoggerFactory.getLogger(InitiatePayCallbackController.class);

    @Autowired
    private PayCallbackFeignClient payCallbackFeignClient;

    @Override
    public Boolean payCallback() {
        logger.info("支付中心：发起支付回调");
        // 此处一般为http调用，使用feign client
        return payCallbackFeignClient.payCallback();
    }

}
