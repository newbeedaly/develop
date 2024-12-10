package cn.newbeedaly.developer.dubbo.order.controller;

import cn.newbeedaly.developer.dubbo.order.dto.req.OrderQueryReqDTO;
import cn.newbeedaly.developer.dubbo.order.service.OrderService;
import cn.newbeedaly.developer.dubbo.pay.dto.req.PayReqDTO;
import cn.newbeedaly.developer.dubbo.pay.dto.res.PayQueryResDTO;
import cn.newbeedaly.developer.dubbo.pay.service.PayService;
import com.alibaba.fastjson.JSON;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderPayController extends OrderBaseController {

    Logger logger = LoggerFactory.getLogger(OrderPayController.class);

    @Reference
    private OrderService orderService;
    @Reference
    private PayService payService;

    @PostMapping("/pay")
    public Boolean pay() {
        // 发起支付
        PayReqDTO dto = PayReqDTO.builder().payAmount(1).orderId("O-001").merchantId("M-001").build();
        logger.info("订单中心：发起支付，请求信息:{}", JSON.toJSONString(dto));
        return payService.pay(dto);
    }

    @GetMapping("/pay/{orderId}")
    String get(@PathVariable("orderId") String orderId) {
        String payId = orderService.getPayIdByOrderId(orderId);
        logger.info("订单中心：查询支付状态信息，支付id:{}", payId);
        PayQueryResDTO pay = payService.getPayById(payId);
        return pay.getPayStatus();
    }

}
