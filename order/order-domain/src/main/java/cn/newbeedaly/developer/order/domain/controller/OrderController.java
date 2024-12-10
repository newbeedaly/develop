package cn.newbeedaly.developer.order.domain.controller;

import cn.newbeedaly.developer.order.api.client.OrderClient;
import cn.newbeedaly.developer.order.api.client.dto.req.OrderQueryReqDTO;
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

    @Override
    public String getPayInfoByOrderId(String orderId) {
        logger.info("订单中心：查询订单信息，订单ID:{}", orderId);
        OrderQueryReqDTO reqDTO = new OrderQueryReqDTO();
        reqDTO.setOrderId(orderId);
        return orderService.getOrderPayByOrderId(reqDTO);
    }
}
