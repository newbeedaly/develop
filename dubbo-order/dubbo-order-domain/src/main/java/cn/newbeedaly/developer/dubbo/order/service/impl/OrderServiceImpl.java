package cn.newbeedaly.developer.dubbo.order.service.impl;

import cn.newbeedaly.developer.dubbo.order.dto.req.OrderQueryReqDTO;
import cn.newbeedaly.developer.dubbo.order.service.OrderService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String getPayByOrderId(OrderQueryReqDTO dto) {
        // 根据订单ID查询出支付
        return getPayIdByOrderId(dto.getOrderId());
    }

    @Override
    public String getPayIdByOrderId(String orderId) {
        // 用于模拟
        return "PAY-" + orderId;
    }

}
