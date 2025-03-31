package cn.newbeedaly.developer.order.domain.service.impl;

import cn.newbeedaly.developer.order.domain.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String getPayId(String orderId) {
        // 用于模拟
        return "PAY-" + orderId;
    }
}
