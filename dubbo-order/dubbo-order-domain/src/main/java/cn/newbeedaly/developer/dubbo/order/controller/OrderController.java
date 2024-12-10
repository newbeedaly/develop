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
public class OrderController extends OrderBaseController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Reference
    private OrderService orderService;

    @GetMapping(value = "/{orderId}")
    public String getPayInfoByOrderId(@PathVariable("orderId") String orderId) {
        logger.info("订单中心：查询订单信息，订单ID:{}", orderId);
        OrderQueryReqDTO orderQueryReqDTO = OrderQueryReqDTO.builder().orderId(orderId).build();
        return orderService.getOrderPayByOrderId(orderQueryReqDTO);
    }

}
