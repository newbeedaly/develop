package cn.newbeedaly.developer.order.domain.controller;

import cn.newbeedaly.developer.order.adaptor.pay.PayFeignClient;
import cn.newbeedaly.developer.order.adaptor.pay.vo.res.PaymentResVO;
import cn.newbeedaly.developer.order.api.client.OrderClient;
import cn.newbeedaly.developer.order.domain.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController extends OrderBaseController implements OrderClient {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayFeignClient payClient;

    @Override
    public String getOrder(String orderId) {
        logger.info("订单中心：查询订单信息，订单ID:{}", orderId);
        return orderService.getPayId(orderId);
    }

    @Override
    public String getPayByOrderId(String orderId) {
        String payId = orderService.getPayId(orderId);
        logger.info("订单中心：查询支付状态信息，支付id:{}", payId);
        PaymentResVO payment = payClient.getPaymentById(payId);
        return payment.getId();
    }
}
